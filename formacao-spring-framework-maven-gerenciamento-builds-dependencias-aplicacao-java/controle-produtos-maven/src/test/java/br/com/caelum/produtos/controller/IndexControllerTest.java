package br.com.caelum.produtos.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IndexControllerTest {

    @Test
    public void isValid() {
        IndexController index = new IndexController();
        Assert.assertTrue(index.isValid(true));
    }
}