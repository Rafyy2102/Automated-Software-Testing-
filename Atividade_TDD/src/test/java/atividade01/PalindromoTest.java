package atividade01;

import org.junit.Assert;
import org.junit.Test;

public class PalindromoTest {

    @Test
    public void VerificandoSeEPalidromo1() {
        Palindromo verificador = new Palindromo();
        String frase = "Rotator";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo2() {
        Palindromo verificador = new Palindromo();
        String frase = "bob";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo3() {
        Palindromo verificador = new Palindromo();
        String frase = "madam";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo4() {
        Palindromo verificador = new Palindromo();
        String frase = "mAlAyAlam";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo5() {
        Palindromo verificador = new Palindromo();
        String frase = "1";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo6() {
        Palindromo verificador = new Palindromo();
        String frase = "Able was I, ere I saw Elba";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo7() {
        Palindromo verificador = new Palindromo();
        String frase = "Madam I’m Adam";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo8() {
        Palindromo verificador = new Palindromo();
        String frase = "Step on no pets.";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }

    @Test
    public void VerificandoSeEPalidromo9() {
        Palindromo verificador = new Palindromo();
        String frase = "Top spot!";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }
    @Test
    public void VerificandoSeEPalidromo10() {
        Palindromo verificador = new Palindromo();
        String frase = "02/02/2020!";
        boolean resposta = verificador.EhPalindromo(frase);
        Assert.assertTrue("erro no algoritmo", resposta);
    }
}