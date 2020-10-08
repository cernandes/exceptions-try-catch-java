# Tratamento de exceções

### Objetivo
Exercício prático de POO para desenvolver os conceitos de tratamento de exceções em Java com o uso dos blocos de ```try``` e ```catch``` tratando as possíveis exceções que possam ocorrer durante a execução do programa.

### Exercício proposto
Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. 
Um saque não pode ocorrer se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta bancária conforme o diagrama de classe:

### Diagrama de classes
<p align="center">
  <img src="./assets/img/08-heranca-e-polimorfismo.jpg" width="350" title="hover text" alt="class diagram">
</p>

#### caso #1
<p>Primeiro caso com saque menor que o limite de saque e o saldo da conta</p>

Number: <span style="color: red">8021</span><br>
Holder: <span style="color: red">Maria</span><br>
Initial balance: <span style="color: red">500.00</span><br>
Withdraw limit: <span style="color: red">300.00</span><br><br>

Enter the amount for withdraw: <span style="color: red">100.00</span><br>

```New balance: 400.00```

#### caso #2
<p>Segundo caso com saque maior que o limite de saque</p>

Number: <span style="color: red">8021</span><br>
Holder: <span style="color: red">Maria</span><br>
Initial balance: <span style="color: red">500.00</span><br>
Withdraw limit: <span style="color: red">300.00</span><br><br>

Enter the amount for withdraw: <span style="color: red">400.00</span><br>

```Withdraw error: the amount exceeds withdraw limit```

#### caso #3
<p>Terceiro caso com saque maior que o limite de saque e o saldo da conta</p>

Number: <span style="color: red">8021</span><br>
Holder: <span style="color: red">Maria</span><br>
Initial balance: <span style="color: red">500.00</span><br>
Withdraw limit: <span style="color: red">300.00</span><br><br>

Enter the amount for withdraw: <span style="color: red">800.00</span><br>

```Withdraw error: the amount exceeds withdraw limit```

#### caso #4
<p>Quarto caso com saque maior que o saldo da conta</p>

Number: <span style="color: red">8021</span><br>
Holder: <span style="color: red">Maria</span><br>
Initial balance: <span style="color: red">200.00</span><br>
Withdraw limit: <span style="color: red">300.00</span><br><br>

Enter the amount for withdraw: <span style="color: red">250.00</span><br>

```Withdraw error: Not enough balance```

### Referência
Projeto inspirado em aulas do curso de POO com java da [Udemy](https://www.udemy.com/course/java-curso-completo) 

### Autor 
@[Claudio Ernandes](https://github.com/cernandes)