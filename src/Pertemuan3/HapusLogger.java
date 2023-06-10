/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author PC - 26 316
 */
public class HapusLogger {
    public int debugLevel;
    
    public HapusLogger(){
        debugLevel=10;
    }
    
    public void debug(String logLine){
        System.out.println("Debug: "+logLine);
    }
    
    public void info(String logLine){
        System.out.println("Info: "+logLine);
    }
}
