// TODO 
/*
Exercice DOM 1

Récupérez l'élément ayant pour ID main-content grâce à son ID ;

Récupérez les éléments ayant pour classe  important  ;

Récupérez les éléments de type  article  ;

Récupérez les éléments de type  li qui sont dans une liste ul ayant la classe  important . Cette liste doit elle-même être dans un article (article ) ;

En reprenant le résultat de la tâche précédente, récupérez l'élément li suivant de la liste ul .
*/

function init(){

var eltid = document.getElementById('main-content');
console.log(eltid)


var eltclass = document.getElementsByClassName("important")
console.log(eltclass)

var eltarticle = document.getElementsByTagName("article")
console.log(eltarticle)

var eltplusieurtype = document.querySelector("article ul.important")
console.log(eltplusieurtype)


var eltplusieurtypeexo5 = document.querySelectorAll("article li") 
console.log(eltplusieurtypeexo5)

}
