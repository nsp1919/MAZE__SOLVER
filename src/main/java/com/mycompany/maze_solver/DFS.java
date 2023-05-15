/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solver;

import java.util.List;

/**
 *
 * @author chinna
 */
public class DFS {
    public static boolean searchpath(int [][]maze,int x,int y,List<Integer>path){
        if(maze[y][x]==9){
        path.add(x);
        path.add(y);
        return true;
        }
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        if (maze[y][x]==0){
        maze[y][x]=2;
        for (int i=0;i<4;i++){
        int xx=dx[i]+x;
        int yy=dy[i]+y; 
           if (searchpath(maze,xx,yy,path)){
           path.add(x);
           path.add(y);
           return true;
           }
        }   
        }
        return false;
    }
    
}
