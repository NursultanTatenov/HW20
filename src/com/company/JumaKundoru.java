package com.company;

public enum JumaKundoru {

    DUISHOMBU("Дуйшонбу кундору JAVA теория сабагы болот"),
    SHEISHEMBI("Шейшемби кундору JAVA практика жана англис тили сабагы болот"),
    SHARSHEMBI("Шаршемби кундору JAVA теория сабагы болот"),
    BEISHEMBI("Бейшенби кундору JAVA практика жана Софт Скилс сабагы сабагы болот"),
    JUMA("Жума кундору JAVA теория сабагы болот"),
    ISHEMBI("Ишемби кундору зунчо практика сабагы болот"),
    JEKSHEMBI("Жекшемби кундору дем алыш куну!");


    String raspisanie;

    JumaKundoru (String raspisanie){
        this.raspisanie=raspisanie;}

    public String raspisanieZanatiy (){
        return raspisanie ;
    }
}
