package br.com.caelum.produtos.controller;

import br.com.caelum.produtos.dao.ProdutoDao;
import br.com.caelum.vraptor.Path;

public class IndexController {
    @Path("/")
    public void index() {
        new ProdutoDao().lista();
    }

    public boolean isValid(Boolean flag) {
        if(flag)
            return  true;
        return false;
    }
}
