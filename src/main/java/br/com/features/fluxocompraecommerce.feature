# encoding UTF-8

@geral @compra
Feature: Fluxo de comprar de um e-commerce
                Como um novo cliente
                Desejo criar um cadastro no e-commerce xpto
                Para poder efetuar uma compra

Background: Fazer o cadastro de um usuário
   Given que eu faça um cadastro de um novo usuário no browser "chrome"

Scenario: Fluxo de compra no Chrome
  When eu selecionar um produto no e-commerce no browser "chrome"
  And adicionar ao carrinho no browser "chrome"
  And preencher as informações necessárias no browser "chrome"
  Then devo visualizar "Your order on My Store is complete." no browser "chrome" 
  
