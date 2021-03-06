package com.example.pedrapapeltesouralagartoespock;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int vitoriaPlayer1 = 0;
    int vitoriaPlayer2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void escolhaPedra(View view){this.player1("Pedra");}
    public void escolhaPapel(View view){this.player1("Papel");}
    public void escolhaTesoura(View view){this.player1("Tesoura");}
    public void escolhaLagarto(View view){this.player1("Lagarto");}
    public void escolhaSpock(View view){this.player1("Spock");}

    @SuppressLint("SetTextI18n")
    public void player1(String player1){

        ImageView imgJogadaPlayer2 = findViewById(R.id.img_jogada_player_2);
        TextView resultadoPartida = findViewById(R.id.txt_resultado);
        TextView txtVitoriaP1 = findViewById(R.id.txt_player_1);
        TextView txtVitoriaP2 = findViewById(R.id.txt_player_2);

        int geradorAleatorioDeJogadas = new Random().nextInt(5);
        String[] jogadasOponente = {"Pedra", "Papel", "Tesoura", "Lagarto", "Spock"};
        String player2 = jogadasOponente[geradorAleatorioDeJogadas];

        switch (player2){
            case "Pedra":
                imgJogadaPlayer2.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imgJogadaPlayer2.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imgJogadaPlayer2.setImageResource(R.drawable.tesoura1);
                break;

            case "Lagarto":
                imgJogadaPlayer2.setImageResource(R.drawable.lagarto);
                break;

            case "Spock":
                imgJogadaPlayer2.setImageResource(R.drawable.vulcano);
                break;
        }

        // Vitoria do oponente
        if(player2.equals("Pedra") && player1.equals("Tesoura")){
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nPedra DESTROI! Tesoura");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Pedra") && player1.equals("Lagarto")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nPedra ESMAGA! Tesoura");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Papel") && player1.equals("Pedra")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nPapel COBRE! Pedra");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Papel") && player1.equals("Spock")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nPapel DESAPROVA! Spock");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Lagarto") && player1.equals("Papel")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nLagarto COME! Papel");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Lagarto") && player1.equals("Spock")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nLagarto ENVENENA! Spock");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Spock") && player1.equals("Pedra")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nSpock VAPORIZA! Pedra");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Spock") && player1.equals("Tesoura")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nSpock QUEBRA! Tesoura");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Tesoura") && player1.equals("Papel")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nTesoura CORTA! Papel");
            vitoriaPlayer2 += 1;
        }else if (player2.equals("Tesoura") && player1.equals("Lagarto")) {
            resultadoPartida.setText("Voc?? Perdeu! :( \n\nTesoura DECAPITA! Lagarto");
            vitoriaPlayer2 += 1;
        }
        // VITORIA DO JOGADOR
        else if(player1.equals("Pedra") && player2.equals("Tesoura")){
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nPedra DESTROI! Tesoura");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Pedra") && player2.equals("Lagarto")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nPedra ESMAGA! Tesoura");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Papel") && player2.equals("Pedra")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nPapel COBRE! Pedra");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Papel") && player2.equals("Spock")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nPapel DESAPROVA! Spock");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Lagarto") && player2.equals("Papel")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nLagarto COME! Papel");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Lagarto") && player2.equals("Spock")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nLagarto ENVENENA! Spock");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Spock") && player2.equals("Pedra")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nSpock VAPORIZA! Pedra");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Spock") && player2.equals("Tesoura")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nSpock QUEBRA! Tesoura");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Tesoura") && player2.equals("Papel")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nTesoura CORTA! Papel");
            vitoriaPlayer1 += 1;
        }else if (player1.equals("Tesoura") && player2.equals("Lagarto")) {
            resultadoPartida.setText("Voc?? Ganhou! ;) \n\nTesoura DECAPITA! Lagarto");
            vitoriaPlayer1 += 1;
        }else{//EMPATE
            resultadoPartida.setText("Empate! :|  \n\n ");
        }

        txtVitoriaP1.setText("Player 1 = " + vitoriaPlayer1);
        txtVitoriaP2.setText(vitoriaPlayer2 + " = Player 2");






    }



}