/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author acer
 */
class Ngitung {

    double VolumeKubus(double rusuk) { //rumus volume kubus
        return rusuk * rusuk * rusuk;
    }

    double LuasPermKubus(double rusuk) { //rumus luas permukaan kubus
        return rusuk * rusuk * 6;
    }

    double VolumeBola(double jari) { //rumus volume bola
        return 4/3 * 3.14 * jari * jari * jari;
    }

    double LuasPermBola(double jari) { //rumus luas permukaan bola
        return 4 * 3.14 * jari * jari;
    }
    double VolumeTabung(double jari1, double tinggi1){ //rumus volume tabung
        return 3.14 * jari1 * jari1 * tinggi1;
    }
    double LuasPermTabung(double jari1, double tinggi1){ //rumus luas permukaan tabung
        return 2 * 3.14 * jari1 * jari1 + 3.14 * 2 * jari1 * tinggi1;
    }
}
