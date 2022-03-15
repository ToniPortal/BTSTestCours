

function hide() {
    const usernameinput = document.getElementById("usernameinput").value;
    const passwordinput = document.getElementById("passwordinput").value;

    if (usernameinput == "peguy" && passwordinput == "peguy") {
        var element = document.getElementById('hide');

        element.style.display = null;
        element.style.visibility = 'visible';

        document.getElementById("Logindiv").style.display = "none";

        Login()
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
    var element = document.getElementById("getid");
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
    const textforupdate = document.querySelector("#textupdate");

    const rawResponse = await fetch(`https://kuz.iotalink.fr/catalogue/produit/${elemente}/_create`, {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer ' + jwt
        },
        body: JSON.stringify({ "categorie": `${makeid(10)}` })
    });
    const data = await rawResponse.json();

    console.log(data);

    textforupdate.innerHTML = `Action: ${data.action} ; Modif de ${data.result._id}`;

}

async function Delete(jwt) {
    const inputdelete = document.getElementById("inputdelete").value;
    const textforupdate = document.querySelector("#textupdate");

    const confirmer = confirm("Voulez-vous continuer?")
    if (confirmer == true) {

        const rawResponse = await fetch('https://kuz.iotalink.fr/catalogue/produit/' + inputdelete, {
            method: 'DELETE',
            headers: {
                'Authorization': 'Bearer ' + jwt
            },
        });
        const data = await rawResponse.json();

        console.log(data);

        textforupdate.innerHTML = `Action: ${data.action} ; Delete ${data.result._id}`;

    } else {

    }
}

function update(jwt) {
    const element = document.getElementById("inputupdate").value;
    const textforupdate = document.querySelector("#textupdate");
console.log($('#categ-select :selected').text())
    const requestOptions = {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': 'Bearer ' + jwt
        },
        body: JSON.stringify({"categorie":`${$('#categ-select :selected').text()}`,"name":`${element}`,"price":50 }),
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

            textforupdate.innerHTML = `Action: ${data.action} Modif de ${data.result._id}`;
            document.getElementById("inputupdate").value = "";
            console.log(data)
        })
        .catch(error => {
            textforupdate.innerHTML = `Error: ${error}`;
            console.error('There was an error!', error);
        });

}

var prof = 1;

var setProgressBar = "";


function get(jwt) {
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
            for (i = 0; i <= count - 1; i++) {

                if (result.result.hits[i]._source.categorie == undefined) {
                    result.result.hits[i]._source.categorie = "Non définie";
                }
                if (result.result.hits[i]._source.prix == undefined) {
                    result.result.hits[i]._source.prix = "Non définie";
                }

                $('#userlist').append("<tr>" +
                    "<th>" + prof + "</th>" +
                    "<td>" + JSON.stringify(
                        result.result.hits[i]._id
                    ) + "</td>" +
                    "<td>" + JSON.stringify(
                        result.result.hits[i]._source.price
                    ) + "</td>" +
                    "<td>" + JSON.stringify(
                        result.result.hits[i]._source.categorie
                    ) + "</td>" +
                    "</tr>");

                $("#profil").html(prof);

                prof = prof + 1;
            }
        })
        .catch((error) => {
            console.error(error);
        });
}



function progress() {
    var w = 0;
    $("#submit").prop("disabled", true);
    $("#body").css("background-color", "red");
    setProgressBar = setInterval(function () {
        w = w + 10;
        $("#progressbar").css("width", w + "%");
        if (w > 100) {
            $("#submit").prop("disabled", false);
            $("#body").css("background-color", "green");
            a();
            $("#progressbar").css("width", "0%");
            stopInterval();
        };
    }, 500);

}

function stopInterval() {
    clearInterval(setProgressBar);

}



function clear() {
    localStorage.clear();
}