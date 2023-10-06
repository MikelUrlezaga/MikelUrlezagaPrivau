function Ikasle (){

    this.izena = izena;
    this.adina = adina;
    if (espezialitatea >= 1 && espezialitatea <= 3) {
        this.espezialitatea = espezialitatea;
      } else {
        this.espezialitatea = 1;
    }
    this.ikaskidea = ikaskidea;

    this.erakusti = function (){
        return this.izena + " " + this.adina + " " + this.espezialitatea + " " + this.adina.ikaskidea;
    }

    this.getIzena = function() {
        return this.izena;
    }

    this.getAdina = function() {
        return this.adina;
    }

    this.getEspezialitatea = function() {
        return this.espezialitatea;
    }

    this.getIkaskidea = function() {
        return this.ikaskidea;
    }

    this.setIzena = function(izena){
        this.izena = izena;
    }

    this.setAdina = function(adina){
        this.adina = adina;
    }

    this.setEspezialitatea = function(espezialitatea){
        this.espezialitatea = espezialitatea;
    }

    this.setIkaskide = function(ikaskidea){
        this.ikaskidea = ikaskidea;
    }
}