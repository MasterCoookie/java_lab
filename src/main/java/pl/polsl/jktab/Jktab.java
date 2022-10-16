/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pl.polsl.jktab;

import pl.polsl.jktab.Controllers.TabController;
import pl.polsl.jktab.Models.Tab;
import pl.polsl.jktab.Views.TabView;


/**
 *
 * @author SuperStudent
 */
public class Jktab {

    public static void main(String[] args) {
        Tab tab = new Tab();
        TabView tabView = new TabView();
        TabController tabController = new TabController(tab, tabView);
        
        tabController.startup();
    }
}
