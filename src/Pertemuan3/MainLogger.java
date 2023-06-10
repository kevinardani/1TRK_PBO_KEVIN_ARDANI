/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;
import Another_Praktikum_PBO_3.Logger;        

/**
 *
 * @author PC - 26 316
 */
public class MainLogger {
    public static void main(String[] args) {
        HapusLogger logger=new HapusLogger();
        
        logger.debug("Debug with level "+logger.debugLevel);
        
        logger.debugLevel=20;
        logger.info("Info with level "+logger.debugLevel);
    }
}
//program dapat diakses walaupun berbeda package di karenakan 
//menggunakan import 