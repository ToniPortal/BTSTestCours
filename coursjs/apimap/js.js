window.onload = function(){
var leCentre = L.latLng(43.2883039,5.3725257);
L.mapquest.key='pUv5Kd5aozU7Q0KpRcqH8ALEbOTeUEUb';
var mapOptions = {
    center: leCentre, layers: L.mapquest.tileLayer('map'), zoom: 15
};
var laCarte = L.mapquest.map('maCarte',mapOptions);

L.mapquest.textMarker([43.2882838,5.3735392], {
    text: 'Charles Péguy',
    subtext: 'Lycée et Enseignement Supérieur',
    position: 'right',
    type: 'marker',
    icon: {
      primaryColor: '#333333',
      secondaryColor: '#333333',
      size: 'sm'
    }
  }).addTo(laCarte);



document.getElementById('btnzoom').addEventListener("click", function(){
    var nbzoom = document.getElementById('nbzoom').value;
    if(!nbzoom){
        alert("Veuillez entrer un nombre avant de cliquer sur le bouton");
    }else{
        laCarte.setZoom(nbzoom);
    }
    
}); 
document.getElementById('btnroute').addEventListener("click", function(){

    L.mapquest.directions().route({
        start: '350 5th Ave, New York, NY 10118',
        end: 'One Liberty Plaza, New York, NY 10006'
      });
    

}); 


}




