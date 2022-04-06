function start(){
    const updatebtnprinc = document.getElementById('updatebtnprinc');
    const createbtnprinc = document.getElementById('createbtnprinc');
    const deletebtnprinc = document.getElementById('deletebtnprinc');
    var updatediv = document.getElementById('updatediv');
    var creatediv = document.getElementById('creatediv');
    var deletediv = document.getElementById('delete');

    updatebtnprinc.addEventListener('click', function (event) {

        if(updatediv.style.visibility == 'visible'){

        }else {
            updatediv.style.display = null;
            updatediv.style.visibility = 'visible';

            creatediv.style.display = "none";
            creatediv.style.visibility = null;
    
            deletediv.style.display = "none";
            deletediv.style.visibility = null;
        }
        
});


createbtnprinc.addEventListener('click', function (event) {


    if(creatediv.style.visibility == 'visible'){

    }else {
        creatediv.style.display = null;
        creatediv.style.visibility = 'visible';

        updatediv.style.display = "none";
        updatediv.style.visibility = null;

        deletediv.style.display = "none";
        deletediv.style.visibility = null;

    }

});


deletebtnprinc.addEventListener('click', function (event) {


    if(deletediv.style.visibility == 'visible'){

    }else {
        deletediv.style.display = null;
        deletediv.style.visibility = 'visible';

        updatediv.style.display = "none";
        updatediv.style.visibility = null;

        creatediv.style.display = "none";
        creatediv.style.visibility = null;
    }

});

}




function hide() {
    const usernameinput = document.getElementById("usernameinput").value;
    const passwordinput = document.getElementById("passwordinput").value;

    if (usernameinput == "peguy" && passwordinput == "peguy") {
        var element = document.getElementById('hide');

        element.style.display = null;
        element.style.visibility = 'visible';

        document.getElementById("Logindiv").style.display = "none";

        Login()
        get(localStorage.getItem('jwt'))
    } else {
        alert("Mauvais password")
    }

}



function disableBtn(idbtn) {
    document.getElementById(idbtn).disabled = true;
}

function enableBtn(idbtn) {
    document.getElementById(idbtn).disabled = false;
}

async function Login() {

    let myHeaders = new Headers();
    const usernameinput = document.getElementById("usernameinput").value;
    const passwordinput = document.getElementById("passwordinput").value;

    let body = {
        username: `${usernameinput}`,
        password: `${passwordinput}`,
    };

    myHeaders.append("Content-Type", "application/json");
    const response = await fetch("https://kuz.iotalink.fr/_login/local/", {
        method: "POST",
        headers: myHeaders,
        body: JSON.stringify(body),
    });
    let res = await response.json();
    console.log(res);

    var jwt = await res.result.jwt;
    console.log(jwt);
    localStorage.setItem("jwt", jwt);
    enableBtn("getid")
    disableBtn("btnlogin")
}


function formatDate(date) {
    return date;
}

function makeid(length) {
    var result = '';
    var characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    var charactersLength = characters.length;
    for (var i = 0; i < length; i++) {
        result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
    return result;
}

async function create(jwt) {
    const elemente = document.getElementById("inputcreate").value;
    const inputcreateprix = document.getElementById("inputcreateprix").value;
    const identifiantinput = document.getElementById("identifiantinput").value;
    const textforupdate = document.querySelector("#textupdate");

    const rawResponse = await fetch(`https://kuz.iotalink.fr/catalogue/produit/${identifiantinput}/_create`, {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer ' + jwt
        },
        body: JSON.stringify({ "categorie": `${$('#categ-create :selected').text()}`, "name": `${elemente}`, "price": `${Number(inputcreateprix)}` })
    });
    const data = await rawResponse.json();

    console.log(data);

    setTimeout(reupdate, 700);


}


async function Delete(jwt,inputdelete) {
    
    console.log("inputdelete:" + inputdelete)
    if(inputdelete == ""){
        inputdelete = document.getElementById("inputdelete").value;
    }
    const textforupdate = document.querySelector("#textupdate");

    const confirmer = confirm("Voulez-vous continuer?")
    if (confirmer == true) {
if(inputdelete == ""){
    alert("Veuillez entrer un identifiant")
}else {
    const rawResponse = await fetch('https://kuz.iotalink.fr/catalogue/produit/' + inputdelete, {
        method: 'DELETE',
        headers: {
            'Authorization': 'Bearer ' + jwt
        },
    });
    const data = await rawResponse.json()

    reupdate()

    //console.log(data);

    textforupdate.innerHTML = `Action: ${data.action} ; Delete ${data.result._id}`;
}


    }

}



function reupdate() {
    console.log("reupdate")
    setTimeout(() => {
        get(localStorage.getItem('jwt'))
    }, 1000);
}


function update(jwt,nb) {
    var element = document.getElementById("inputupdate").value;
    var prixinput = document.getElementById("inputprix").value;
var categorie = $('#categ-select :selected').text();
     if(nb == 1) {
         element = document.getElementById("inputupdatebox").value;
         prixinput = document.getElementById("inputprixbox").value;
         categorie = $('#categ-selectbox :selected').text();
    }

    const requestOptions = {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Bearer ' + jwt
        },
        body: JSON.stringify({ "categorie": `${categorie}`, "name": `${element}`, "price": `${prixinput}` }),
    };

    fetch(`https://kuz.iotalink.fr/catalogue/produit/${element}/_update`, requestOptions)
        .then(async response => {
            const isJson = response.headers.get('content-type')?.includes('application/json');
            const data = isJson && await response.json();

            // check for error response
            if (!response.ok) {
                // get error message from body or default to response status
                const error = (data && data.message) || response.status;
                return Promise.reject(error);
            }

            setTimeout(reupdate, 700);

            document.getElementById("inputupdate").value = "";
            document.getElementById("inputprix").value = "";
            console.log(data)


        })

}




 function suppTr() {
    var tr = document.querySelectorAll("#userlist tr");
    console.log("TRLENGHT: " + tr.length)
    if (tr.length != 0) {
        for (i = 0; i < tr.length; i++) {
            console.log(i)
            tr[i].parentNode.removeChild(tr[i]);
        }
    }

}



var setProgressBar = "";


async function get(jwt) {
    suppTr()

    var prof = 1;
    //+ get(localStorage.getItem('jwt')),

    myHeaders2 = new Headers({
        Authorization: `Bearer ${jwt}`,
        "Content-Type": "application/json",
    });
    fetch("https://kuz.iotalink.fr/catalogue/produit", {
        headers: myHeaders2,
        method: "GET",
    })
        .then((response) => response.json())
        .then((result) => {
            console.log(result)
            var count = Object.keys(result.result.hits).length;

            for (i = 0; i < count; i++) {

                if (result.result.hits[i]._id == undefined || result.result.hits[i]._id == " ") {
                    result.result.hits[i]._id = "Produit définie";
                }
                if (result.result.hits[i]._source.categorie == undefined) {
                    result.result.hits[i]._source.categorie = "Non définie";
                }
                if (result.result.hits[i]._source.price == "NaN" || result.result.hits[i]._source.price == undefined) {
                    result.result.hits[i]._source.price = "Non définie";
                }
                if (result.result.hits[i]._source.identifiant == undefined) {
                    result.result.hits[i]._source.identifiant = "Non définie";
                }

                $('#userlist').append("<tr>" +
                    "<th>" + prof + "</th>" +
                    "<td>" +
                    result.result.hits[i]._id
                    + "</td>" +
                    "<td>" +
                    result.result.hits[i]._source.price
                    + "</td>" +
                    "<td>" +
                    result.result.hits[i]._source.categorie
                    + "</td>" +
                    "<td>" +
                    result.result.hits[i]._source.identifiant
                    + `</td> <td><button onclick="updatebtn(${prof})" class="btn btn-primary">Update</button><button onclick="deletebtn(${prof})" class="btn btn-danger">Delete</button> </td>` +
                    "</tr>");

                $("#profil").html(prof);

                prof +=  1;
            }
        })
        .catch((error) => {
            console.error(error);
        });
}

function updatebtn(prof){
    var rows =document.getElementsByTagName("tbody")[0].rows;

var tbljv = [];

    for(var i=0;i< 4;i++){
        var td = rows[prof -1].getElementsByTagName("td")[i].innerHTML;
        console.log(td)
        tbljv.push(td)
        }
        console.log(tbljv)

const htmls = `<div class="card">
<div class="card-body">
<div class="input-group flex-nowrap">
<span class="input-group-text" id="addon-wrapping">Produit</span>
<input type="text" class="form-control" value="${tbljv[0]}" placeholder="Produit" aria-label="Produit" aria-describedby="addon-wrapping" id="inputupdatebox">
</div>



<div class="input-group mb-3">
<span class="input-group-text" id="inputGroup-sizing-default">Prix</span>
<input type="text" class="form-control" value="${tbljv[1]}" placeholder="Prix" aria-label="Prix" id="inputprixbox" aria-describedby="inputGroup-sizing-default">
</div>



<label for="categ-selectbox">catégorie:</label>
<select class="form-select" name="categ" id="categ-selectbox">
  <option value="">--Please choose an option--</option>
  <option value="écran">écran</option>
  <option value="console">Console</option>
</select>
</div>
<button onclick="update(localStorage.getItem('jwt'),1)">Update</button>`;

$("#categ-selectbox option[value=écran]").prop("selected", "selected")


    new WinBox({
        title: "Update",
        html: htmls
    });

}

function deletebtn(prof){
    

    var rows =document.getElementsByTagName("tbody")[0].rows;

        var td = rows[prof -1].getElementsByTagName("td")[0].innerText;
           
console.log(td)
 /*
const htmls = `<button id="btndelte" onclick="Delete(localStorage.getItem('jwt'),${td})">DELETE</button>`;
*/

Delete(localStorage.getItem('jwt'),td);

}



function stopInterval() {
    clearInterval(setProgressBar);

}



function clear() {
    localStorage.clear();
    location.reload();
return false;

}