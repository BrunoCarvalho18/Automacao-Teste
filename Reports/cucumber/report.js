$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fluxocompraecommerce.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Fluxo de comprar de um e-commerce",
  "description": "              Como um novo cliente\r\n              Desejo criar um cadastro no e-commerce xpto\r\n              Para poder efetuar uma compra",
  "id": "fluxo-de-comprar-de-um-e-commerce",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@geral"
    },
    {
      "line": 3,
      "name": "@compra"
    }
  ]
});
formatter.background({
  "line": 9,
  "name": "Fazer o cadastro de um usuário",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que eu faça um cadastro de um novo usuário no browser \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 55
    }
  ],
  "location": "FluxoComprasSteps.que_eu_faça_um_cadastro_de_um_novo_usuário_no_browser(String)"
});
formatter.result({
  "duration": 18626886900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Fluxo de compra no Chrome",
  "description": "",
  "id": "fluxo-de-comprar-de-um-e-commerce;fluxo-de-compra-no-chrome",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 13,
  "name": "eu selecionar um produto no e-commerce no browser \"chrome\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "adicionar ao carrinho no browser \"chrome\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "preencher as informações necessárias no browser \"chrome\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "devo visualizar \"Your order on My Store is complete.\" no browser \"chrome\"",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 51
    }
  ],
  "location": "FluxoComprasSteps.eu_selecionar_um_produto_no_e_commerce_no_browser(String)"
});
formatter.result({
  "duration": 2612032300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 34
    }
  ],
  "location": "FluxoComprasSteps.adicionar_ao_carrinho_no_browser(String)"
});
formatter.result({
  "duration": 6121285900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 49
    }
  ],
  "location": "FluxoComprasSteps.preencher_as_informações_necessárias_no_browser(String)"
});
formatter.result({
  "duration": 104600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your order on My Store is complete.",
      "offset": 17
    },
    {
      "val": "chrome",
      "offset": 66
    }
  ],
  "location": "FluxoComprasSteps.devo_visualizar_no_browser(String,String)"
});
formatter.result({
  "duration": 189000,
  "status": "passed"
});
});