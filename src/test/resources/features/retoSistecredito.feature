#Autor: mrestrepor@choucairtesting.com

  @stories
  Feature: Challenge Sistecredito
    As a user, I want to enter "Falabella" and pay for products until the purchase is complete.

    @scenario1
    Scenario: Enter products and finalize purchase
      Given than Isabel wants to enter products and redirect to successful checkout
      When  you select a product you are redirected to checkout
      Then it shows the process of the purchase completed successfully
