package com.xworkz.engineerapp;

import com.xworkz.engineerapp.CsEngineer.CsEngineer;
import com.xworkz.engineerapp.marineEngineer.MarineEngineer;

public class EngineerExecutor {
    public static void main(String[] args) {

        //polimorphism
        Engineer engineer = new CsEngineer();
            engineer.problemSolving();

        CsEngineer csEngineer = (CsEngineer) engineer;
        csEngineer.softwareDevelopment();

        Engineer engineer1 = new MarineEngineer();

        MarineEngineer marineEngineer = (MarineEngineer) engineer1 ;
        marineEngineer.enjoy();


        }
    }