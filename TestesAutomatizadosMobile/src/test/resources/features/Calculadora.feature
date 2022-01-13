#language: pt
#encoding: UTF-8
@Calculadora
Funcionalidade: Calculadora mobile
  
  eu como um usuario gostaria de somar dois numeros na calculadora mobile

  Contexto: 

  @cenario1 @cenariotest
  Cenario: Somar dois numeros
    Quando eu digitar o numero "2"
    E eu acionar a tecla mais
    E eu digitar o numero "2"
    Entao a calculadora apresenta o resultado "4"

 
