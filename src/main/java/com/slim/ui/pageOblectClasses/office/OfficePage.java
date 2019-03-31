package com.slim.ui.pageOblectClasses.office;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Coordinates;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class OfficePage {
    ElementsCollection logTripButton = $$("[class='btn mx-button mx-name-actionButton10 btnRight > img btn-inverse']");
    ElementsCollection startTimePlanned = $$("[class='mx-name-datePicker1 listview-content']");
    ElementsCollection endTimePlanned = $$("[class='mx-name-datePicker2 listview-content']");
    ElementsCollection endTimePlanned2 = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid9 center-align-childs'] [class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid11']");
    ElementsCollection fieldForStartTime = $$("[class='mx-name-textBox12']");
    ElementsCollection fieldForEndTime = $$("[class='mx-name-textBox13']");
    ElementsCollection startTimePlanned2 = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid9 center-align-childs'] [class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid11']");
    SelenideElement distance = $("[class='form-group mx-name-textBox3'] [class='col-sm-5'] [class='form-control']");
    SelenideElement inputTripEndMileage = $("[class*='form-group mx-name-textBox2'] [class='col-sm-5'] [class='form-control']");
    SelenideElement saveButton = $("[class='btn mx-button mx-name-actionButton4 btn-success']");
    SelenideElement administrationButton = $("[class='btn mx-button mx-name-actionButton11 fa fa-road btn-default']");
    List <Integer> StartTimePlanned = new ArrayList<Integer>();
    List <Integer>  EndTimePlanned = new ArrayList<Integer>();
    List <Integer>  FieldForStartTime = new ArrayList<Integer>();
    List <Integer>  FieldForEndTime = new ArrayList<Integer>();
    List <String> StartTimePlannedString = new ArrayList<String>();
    List <String> EndTimePlannedString = new ArrayList<String>();

    public OfficePage clickLastTripLogButton(){
            sleep(1000);
            logTripButton.last().click();
            return this;
    }
    public OfficePage clickAdministrationButton(){
        sleep(1000);
        administrationButton.click();
        return this;
    }
/*    public OfficePage findPositionOfStartTimePlanned(){
        sleep(2000);
        for (int i = 0; i < startTimePlanned.size(); i++) {
            int PlannedStartCoorY = startTimePlanned.get(i).getCoordinates().onPage().getY();
            int plandStWidth = startTimePlanned.get(i).getSize().getWidth();
            int plandStHeight = startTimePlanned.get(i).getSize().getHeight();
            int plandStCenter = ();
           // Point Coord = startTimePlanned.get(i).toWebElement().getLocation();
            System.out.println(PlannedStartCoorY);
            // System.out.println(Coord);
            System.out.println("plandStWidth " + plandStWidth);
            System.out.println("plandStHeight " + plandStHeight);
            StartTimePlanned.add(PlannedStartCoorY);
        }
        System.out.println("StartTimePlanned: " + StartTimePlanned + " ");
        return this;
    }*/
    public OfficePage findPositionOfStartTimePlanned(){
        sleep(2000);
        for (int i = 0; i < startTimePlanned2.size(); i++) {
            int PlannedStartCoorY = startTimePlanned2.get(i).getCoordinates().onPage().getY();
            //String PlannedStartCoorYStr = Integer.toString(PlannedStartCoorY);
            String PlannedStartTimeSt = startTimePlanned.get(i).getText();
            StartTimePlanned.add(PlannedStartCoorY);
            StartTimePlannedString.add(PlannedStartTimeSt);
        }
        System.out.println("StartTimePlanned: " + StartTimePlanned + " ");
        System.out.println("StartTimePlannedString: " + StartTimePlannedString + " ");
        return this;
    }
    public OfficePage findPositionOfFieldForStartTime(){
        sleep(2000);
        for (int i = 0; i < fieldForStartTime.size(); i++) {
            int FieldStartCoorY= fieldForStartTime.get(i).getCoordinates().onPage().getY();
            int FieldStartCoorYPls2 = FieldStartCoorY + 2;
          //  String FieldStartCoorYPls2Str = Integer.toString(FieldStartCoorYPls2);
            // System.out.println("Field Start Coordinate Y Pls 2 " + FieldStartCoorYPls2);
            FieldForStartTime.add(FieldStartCoorYPls2);
        }
        System.out.println("FieldForStartTime: " + FieldForStartTime);
        return this;
    }
    public OfficePage checkSimCoordinates(){

        StartTimePlanned.retainAll(FieldForStartTime);
        EndTimePlanned.retainAll(FieldForEndTime);
        System.out.println("Start Time Similar: " + StartTimePlanned);
        System.out.println("End Time Similar: " + EndTimePlanned);
        return this;
    }
    public OfficePage findPositionOfEndTimePlanned(){
        sleep(2000);
        for (int i = 0; i < endTimePlanned.size(); i++) {
            int PlannedEndCoorY = endTimePlanned2.get(i).getCoordinates().onPage().getY();
            //System.out.println(PlannedEndCoorY);
            String PlannedEndString = endTimePlanned.get(i).getText();
            EndTimePlanned.add(PlannedEndCoorY);
            EndTimePlannedString.add(PlannedEndString);
        }
        System.out.println("EndTimePlanned: " + EndTimePlanned + " ");
        System.out.println("End Time Planned String: " + EndTimePlannedString);
        return this;
    }

    public OfficePage findPositionOfFieldForEndTime(){
        sleep(2000);
        for (int i = 0; i < fieldForEndTime.size(); i++) {
            int FieldEndCoorY = fieldForEndTime.get(i).getCoordinates().onPage().getY();
            //System.out.println(FieldEndCoorY);
            FieldForEndTime.add(FieldEndCoorY);
        }
        System.out.println("FieldForEndTime: " + FieldForEndTime + " ");
        return this;
    }
}




