# Calcula IMC

## Introdução
Projeto para fins didáticos, com uma pequena implementação de uma calculadora que calcula o seu IMC (Indice de Massa Corporal).

## Configuração do projeto
Ele pode ser baixado conforme abaixo:
```sh
$ git clone https://github.com/SamuelDevMobile/CalculaImc_Android_Aula.git
```
Abra-o no seu Android Studio
<img width="796" alt="Captura de Tela 2022-08-18 às 16 49 30" src="https://user-images.githubusercontent.com/26841238/185482115-adb2f78d-4b36-4cac-a6b7-d2806b0b7bc5.png">

Execute o projeto no seguinte icone.
<img width="24" alt="Captura de Tela 2022-08-18 às 16 50 33" src="https://user-images.githubusercontent.com/26841238/185482305-56a82404-d54c-4590-a658-b855461eb1d2.png">

## Visão geral da arquitetura
Foi usado Data Class, Enum Class, testes unitarios e testes com Expresso

## Fluxo de trabalho de Controle de Versão
Usamos vagamente a abordagem "Git flow": master é a versão
branch - deve ser sempre liberável e apenas mesclado em
quando testamos e verificamos que tudo funciona e está
bom para ir.

O desenvolvimento diário é feito no ramo de desenvolvimento. Características,
correções de bugs e outras tarefas são feitas como ramificações do desenvolvimento,
em seguida, mesclado de volta ao desenvolvimento diretamente ou por meio de solicitações pull.

Mantenha os commits atômicos e autoexplicativos, use o rebase para limpar
até ramificações confusas antes de se fundir novamente no desenvolvimento.

## Ambiente de teste
```
Android Studio Chipmunk | 2021.2.1 Patch 1
dispositivo de teste: Android O (Google Pixel 2)
Certifique-se de que seu dispositivo tenha a versão Android >= 21.
```

## Tela Principal
> Tela responsável para calcular sem IMC.

![image](https://user-images.githubusercontent.com/26841238/199861127-ea42d195-9024-4aa6-9e6f-c0fddfac44ee.png)
