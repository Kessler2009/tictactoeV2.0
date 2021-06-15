package com.TicTacToe;

public class Check {
    public static char TX = 'X';
    public static char TO = 'O';

    public static char rows(char[][] field){
        //TODO duplicated code
        for(int i = 0; i< field.length; i++){
            int counterX = 0;
            int counterO = 0;
            for(int j = 0; j< field.length; j++){
                if(field[i][j] == TX){
                    counterX++;
                }   else if(field[i][j] == TO){
                    counterO++;
                }
            }
            if(counterX == field.length){
                return TX;
            }
            if(counterO == field.length){
                return TO;
            }
        }
        return '/';
    }


    public static char cols(char[][] field){
        //TODO duplicated code
        for(int i = 0; i< field.length; i++){
            int counterX = 0;
            int counterO = 0;
            for(int j = 0; j< field.length; j++){
                if(field[j][i] == TX){
                    counterX++;
                }   else if(field[j][i] == TO){
                    counterO++;
                }
            }
            if(counterX == field.length){
                return TX;
            }
            if(counterO == field.length){
                return TO;
            }
        }
        return '/';
    }


    public static char diagonal1(char[][] field){

        //TODO duplicated code
        int counterX = 0;
        int counterY = 0;
        for(int i = 0; i< field.length; i++){
            if(field[i][field.length -1-i] == TX){
                counterX++;
            }   else if(field[i][field.length -1-i] == TO){
                counterY++;
            }
            if(counterX == field.length){
                return TX;
            }
            if(counterY == field.length){
                return TO;
            }
        }
        return '/';
    }


    public static char diagonal2(char[][] field){

        //TODO duplicated code
        int counterX = 0;
        int counterY = 0;
        for(int i = 0; i< field.length; i++){
            if(field[i][i] == TX){
                counterX++;
            }   else if(field[i][i] == TO){
                counterY++;
            }
            if(counterX == field.length){
                return TX;
            }
            if(counterY == field.length){
                return TO;
            }
        }
        return '/';
    }

    public static boolean deathheat(char[][] field){
        int counter = 0;
        for(int i = 0; i< field.length; i++){
            for(int j = 0; j< field.length; j++){
                if(field[i][j] == ' '){
                    counter++;
                }
            }
        }
        return counter == 0;
    }


}
