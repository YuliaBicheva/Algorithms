package ua.algo.bicheva;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yulia on 27.09.16.
 */
public class KarazubaTest {

    @Test
    public void test1(){
        Karazuba X = new Karazuba("49823261");
        Karazuba Y = new Karazuba("44269423");
        Karazuba Z = X.multiply(Y);

        String expected = "2205647016448403";
        Assert.assertEquals(expected, Z.toString());
    }

    @Test
    public void test2(){
        Karazuba X = new Karazuba("54761293");
        Karazuba Y = new Karazuba("65394884");
        Karazuba Z = X.multiply(Y);

        String expected = "3581108403425012";
        Assert.assertEquals(expected, Z.toString());
    }

    @Test
    public void test3(){
        Karazuba X = new Karazuba("9313685456934674");
        Karazuba Y = new Karazuba("7658898761837539");
        Karazuba Z = X.multiply(Y);

        String expected = "71332574014261268360454523927286";
        Assert.assertEquals(expected, Z.toString());
    }

    public void test4(){
        Karazuba X = new Karazuba("3957322621234423");
        Karazuba Y = new Karazuba("7748313756335578");
        Karazuba Z = X.multiply(Y);

        String expected = "30662577304368647842211393201494";
        Assert.assertEquals(expected, Z.toString());
    }

    @Test
    public void test5(){
        Karazuba X = new Karazuba("34215432964249374812219364786397");
        Karazuba Y = new Karazuba("94541964835273822784327848699719");
        Karazuba Z = X.multiply(Y);

        String expected = "3234794260129733170788831535430575611379062580407060392628922443";
        Assert.assertEquals(expected, Z.toString());
    }

    @Test
    public void test6(){
        Karazuba X = new Karazuba("8436939677358274975644341226884162349535836199962392872868456892");
        Karazuba Y = new Karazuba("3864264464372346883776335161325428226997417338413342945574123327");
        Karazuba Z = X.multiply(Y);

        String expected = "32602566183268675582196165592691544162522778809155901895617284287276672563976841699892789718741377833554298336397153444191119684";
        Assert.assertEquals(expected, Z.toString());
    }

    @Test
    public void test7(){
        Karazuba X = new Karazuba("8711129198194917883527844183686122989894424943636426448417394566");
        Karazuba Y = new Karazuba("2924825637132661199799711722273977411715641477832758942277358764");
        Karazuba Z = X.multiply(Y);

        String expected = "25478534007255378799894857247961445544397925869179138904636157575535921570058983065006369481295619500406669960288667484926076424";
        Assert.assertEquals(expected, Z.toString());
    }
}