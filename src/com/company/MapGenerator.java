package com.company;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickWight;
    public int brickHeight;
    public MapGenerator(int row,int col){
        map = new int[row][col];
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }

        brickWight = 540/col;
        brickHeight = 150/row;
    }

    public void draw(Graphics2D g){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] > 0){
                    g.setColor(Color.WHITE);
                    g.fillRect(j * brickWight + 80, i * brickHeight + 50, brickWight, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j * brickWight + 80, i * brickHeight + 50, brickWight, brickHeight);
                }
            }
        }
    }

    public void setBrickvalue(int value, int row, int col){
        map[row][col] = value;
    }
}
