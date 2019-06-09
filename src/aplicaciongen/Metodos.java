/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongen;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author jaimem
 */
public class Metodos {

    static final String juicio = "El fiscal del Tribunal Supremo, Javier Zaragoza, ha afirmado que \"en Cataluña hubo un golpe de Estado\" durante el informe final del Ministerio Público en el juicio sobre el 1-O. \n";
    static final String juicio2 = "\"Lo que sucedió en Cataluña entre marzo de 2015 y octubre de 2017 fue un golpe de Estado, que es la sustitución de un orden jurídico por otro por métodos ilegales. \n";
    static final String juicio3 = "Eso es el procés\" señalaba el fiscal mientras hacía referencia al jurista Hans Kelsen, que tuvo que huir a EEUU, ante el auge del nazismo.";
    static final String juicio4 = "Zaragoza sostenía que lo vivido en Cataluña \"ha sido la crónica de un alzamiento anunciado,";
    static final String juicio5 = "los españoles la han visto todo a través de las televisiones. Son hechos públicos y notorios.";
    static final String juicio6 = "Zaragoza sostenía que lo vivido en Cataluña \"ha sido la crónica de un alzamiento anunciado,";
    static final String juicio7 = "El fiscal recordaba que los golpistas \"han desobedecido todas y cada una de las decisiones, autos y sentencias dictadas por el Tribunal Constitucional\"";
    public static ArrayList<String> drawString() {
        ArrayList<String> string = new ArrayList();
        string.add(juicio);
        string.add(juicio2);
        string.add(juicio3);
        string.add(juicio4);
        string.add(juicio5);
        string.add(juicio6);
        string.add(juicio7);
        return string;
    }

    public static ArrayList<Contacto> contactos() {
        ArrayList<Contacto> novedades = new ArrayList();

        Contacto c = new Contacto("Juicio", "Jucio del Proces", "Novedades del juicio del proces", "N/D");
        c.descripcion = "Realidad y propaganda. Las observaciones de Simon Kuper sobre los líderes del Partido Conservador británico son trasladables a los dirigentes independentistas: algunos fingen; saben que entender la realidad no te ofrece una ventaja política si tus electores no lo hacen; son incapaces de admitir errores pasados; al negar la realidad demuestran su fanatismo a otros fanáticos.\n"
                + "\n"
                + "Objetivos. La independencia ya no parece una meta a corto plazo; se trata de reforzar un imaginario victimista. No se habla tanto de secesión; se habla de los presos. El mecanismo es aprovechar las garantías de la democracia española para desgastarla. Ese juego es molesto, pero las garantías son imprescindibles. Otros prefieren olvidar e intentan reconstruir la situación anterior, en la que el nacionalismo era hegemónico, aunque no siempre mayoritario, y donde la defensa de la cultura o la identidad se instrumentalizó en un proyecto excluyente y desleal.\n"
                + "\n"
                + "Judicialización. Quien judicializó la situación fueron los líderes que optaron por una vía ilegal. No lograron doblegar al Estado, y es preferible que la respuesta haya sido del Estado y no de un Gobierno. Nadie piensa que la solución al problema sea exclusivamente judicial, pero pretender que los acusados no merecen escrutinio y quizá reproche penal solo se explica si pensamos que pertenecen a una clase de personas que está por encima de la ley, o que las instituciones que atacaron no son legítimas y no tienen derecho a defenderse.";

        Contacto c1 = new Contacto("Consulta", "Accidente", "Queria consultarle sobre un accidente de coche", "juanFernandez@anonimo.com");
        Contacto c2 = new Contacto("Consulta", "Trafico", "He sido acusado de trafico de drogas", "emilioescobar@hotmail.com");
        Contacto c3 = new Contacto("Juicio", "Jucio del Proces", "Novedades del juicio del proces", "N/D");
        c.descripcion = "Realidad y propaganda. Las observaciones de Simon Kuper sobre los líderes del Partido Conservador británico son trasladables a los dirigentes independentistas: algunos fingen; saben que entender la realidad no te ofrece una ventaja política si tus electores no lo hacen; son incapaces de admitir errores pasados; al negar la realidad demuestran su fanatismo a otros fanáticos.\n"
                + "\n"
                + "Objetivos. La independencia ya no parece una meta a corto plazo; se trata de reforzar un imaginario victimista. No se habla tanto de secesión; se habla de los presos. El mecanismo es aprovechar las garantías de la democracia española para desgastarla. Ese juego es molesto, pero las garantías son imprescindibles. Otros prefieren olvidar e intentan reconstruir la situación anterior, en la que el nacionalismo era hegemónico, aunque no siempre mayoritario, y donde la defensa de la cultura o la identidad se instrumentalizó en un proyecto excluyente y desleal.\n"
                + "\n"
                + "Judicialización. Quien judicializó la situación fueron los líderes que optaron por una vía ilegal. No lograron doblegar al Estado, y es preferible que la respuesta haya sido del Estado y no de un Gobierno. Nadie piensa que la solución al problema sea exclusivamente judicial, pero pretender que los acusados no merecen escrutinio y quizá reproche penal solo se explica si pensamos que pertenecen a una clase de personas que está por encima de la ley, o que las instituciones que atacaron no son legítimas y no tienen derecho a defenderse.";

        Contacto c4 = new Contacto("Consulta", "Accidente", "Queria consultarle sobre un accidente de coche", "juanFernandez@anonimo.com");
        Contacto c5 = new Contacto("Consulta", "Trafico", "He sido acusado de trafico de drogas", "emilioescobar@hotmail.com");
        Contacto c8 = new Contacto("Juicio", "Jucio del Proces", "Novedades del juicio del proces", "N/D");
        c.descripcion = "Realidad y propaganda. Las observaciones de Simon Kuper sobre los líderes del Partido Conservador británico son trasladables a los dirigentes independentistas: algunos fingen; saben que entender la realidad no te ofrece una ventaja política si tus electores no lo hacen; son incapaces de admitir errores pasados; al negar la realidad demuestran su fanatismo a otros fanáticos.\n"
                + "\n"
                + "Objetivos. La independencia ya no parece una meta a corto plazo; se trata de reforzar un imaginario victimista. No se habla tanto de secesión; se habla de los presos. El mecanismo es aprovechar las garantías de la democracia española para desgastarla. Ese juego es molesto, pero las garantías son imprescindibles. Otros prefieren olvidar e intentan reconstruir la situación anterior, en la que el nacionalismo era hegemónico, aunque no siempre mayoritario, y donde la defensa de la cultura o la identidad se instrumentalizó en un proyecto excluyente y desleal.\n"
                + "\n"
                + "Judicialización. Quien judicializó la situación fueron los líderes que optaron por una vía ilegal. No lograron doblegar al Estado, y es preferible que la respuesta haya sido del Estado y no de un Gobierno. Nadie piensa que la solución al problema sea exclusivamente judicial, pero pretender que los acusados no merecen escrutinio y quizá reproche penal solo se explica si pensamos que pertenecen a una clase de personas que está por encima de la ley, o que las instituciones que atacaron no son legítimas y no tienen derecho a defenderse.";

        Contacto c6 = new Contacto("Consulta", "Accidente", "Queria consultarle sobre un accidente de coche", "juanFernandez@anonimo.com");
        Contacto c7 = new Contacto("Consulta", "Trafico", "He sido acusado de trafico de drogas", "emilioescobar@hotmail.com");
        novedades.add(c);
        novedades.add(c1);
        novedades.add(c2);
        novedades.add(c3);
        novedades.add(c4);
        novedades.add(c5);
        novedades.add(c6);
        novedades.add(c7);
        novedades.add(c8);

        return novedades;
    }

}
