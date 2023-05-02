document.addEventListener("DOMContentLoaded", function(event) { 
                
    var children = document.getElementById("aside").children;
    for (var i = 0; i < children.length; i++) {
        var child = children[i];
        child.addEventListener("click", function(event) {
            for (var j = 0; j < children.length; j++) {
                children[j].classList.remove('active');
            }
            event.target.classList.add('active');
        });
    }
});