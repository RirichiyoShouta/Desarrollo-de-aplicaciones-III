/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Ciel Michaelis
 */
public class Prueba extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    public int resp0, res_correctas, res_incorrectas=0;
    public String val;
    

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form Intro;
    private StringItem stringItem;
    private Form PREG1;
    private ChoiceGroup choiceGroup;
    private Form PREG2;
    private ChoiceGroup choiceGroup1;
    private Form PREG3;
    private ChoiceGroup choiceGroup2;
    private Form PREG4;
    private TextField textField;
    private Form PREG5;
    private ChoiceGroup choiceGroup3;
    private Alert alert;
    private Form FIN;
    private StringItem stringItem1;
    private Command okCommand;
    private Command okCommand1;
    private Command okCommand2;
    private Command okCommand3;
    private Command okCommand4;
    private Command okCommand5;
    private Command okCommand6;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The Prueba constructor.
     */
    public Prueba() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getIntro());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display;
     * if <code>null</code>, then <code>nextDisplayable</code> is set
     * immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == FIN) {//GEN-BEGIN:|7-commandAction|1|63-preAction
            if (command == okCommand6) {//GEN-END:|7-commandAction|1|63-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|2|63-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|16-preAction
        } else if (displayable == Intro) {
            if (command == okCommand) {//GEN-END:|7-commandAction|3|16-preAction
                // write pre-action user code here
                switchDisplayable(null, getPREG1());//GEN-LINE:|7-commandAction|4|16-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|22-preAction
        } else if (displayable == PREG1) {
            if (command == okCommand1) {//GEN-END:|7-commandAction|5|22-preAction
               resp0 = this.choiceGroup.getSelectedIndex();
                if (resp0==1)
                {
                    res_correctas = res_correctas+1;
                }
                switchDisplayable(null, getPREG2());//GEN-LINE:|7-commandAction|6|22-postAction

            }//GEN-BEGIN:|7-commandAction|7|29-preAction
        } else if (displayable == PREG2) {
            if (command == okCommand2) {//GEN-END:|7-commandAction|7|29-preAction
                resp0 = this.choiceGroup1.getSelectedIndex();
                if(resp0 ==1)
                {
                    res_correctas = res_correctas+1;
                }
                switchDisplayable(null, getPREG3());//GEN-LINE:|7-commandAction|8|29-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|38-preAction
        } else if (displayable == PREG3) {
            if (command == okCommand3) {//GEN-END:|7-commandAction|9|38-preAction
               resp0 = this.choiceGroup2.getSelectedIndex();
               if(resp0 == 1)
               {
                   res_correctas = res_correctas+1;
               }
                switchDisplayable(null, getPREG4());//GEN-LINE:|7-commandAction|10|38-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|47-preAction
        } else if (displayable == PREG4) {
            if (command == okCommand4) {//GEN-END:|7-commandAction|11|47-preAction
               val = this.textField.getString();
               if(val.equals("C") || val.equals("c"))
               {
               res_correctas = res_correctas+1;
               }
                switchDisplayable(null, getPREG5());//GEN-LINE:|7-commandAction|12|47-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|53-preAction
        } else if (displayable == PREG5) {
            if (command == okCommand5) {//GEN-END:|7-commandAction|13|53-preAction
                // write pre-action user code here
                switchDisplayable(getAlert(), getFIN());//GEN-LINE:|7-commandAction|14|53-postAction
                resp0 = this.choiceGroup3.getSelectedIndex();
                if(resp0 == 2)
                {
                res_correctas = res_correctas+1;    
                }
                res_incorrectas = 5 - res_correctas;
                this.alert.setString("ACIERTOS"+" "+res_correctas+"\nERRORES"+" "+res_incorrectas);
            }//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
        }//GEN-END:|7-commandAction|15|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|16|
//</editor-fold>//GEN-END:|7-commandAction|16|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Intro ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of Intro component.
     *
     * @return the initialized component instance
     */
    public Form getIntro() {
        if (Intro == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            Intro = new Form("form", new Item[]{getStringItem()});//GEN-BEGIN:|14-getter|1|14-postInit
            Intro.addCommand(getOkCommand());
            Intro.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return Intro;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            stringItem = new StringItem("Bienvenidos", "TEST SOBRE REDES");//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PREG1 ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initialized instance of PREG1 component.
     *
     * @return the initialized component instance
     */
    public Form getPREG1() {
        if (PREG1 == null) {//GEN-END:|19-getter|0|19-preInit
            // write pre-init user code here
            PREG1 = new Form("form", new Item[]{getChoiceGroup()});//GEN-BEGIN:|19-getter|1|19-postInit
            PREG1.addCommand(getOkCommand1());
            PREG1.setCommandListener(this);//GEN-END:|19-getter|1|19-postInit
            // write post-init user code here
        }//GEN-BEGIN:|19-getter|2|
        return PREG1;
    }
//</editor-fold>//GEN-END:|19-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Una red: \u00BFes el conjunto de equipos y dispositivos conectados entre s\u00ED para interactuar y compartir recursos?", Choice.EXCLUSIVE);//GEN-BEGIN:|24-getter|1|24-postInit
            choiceGroup.append("FALSO", null);
            choiceGroup.append("VERDADERO", null);
            choiceGroup.setSelectedFlags(new boolean[]{false, false});//GEN-END:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PREG2 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of PREG2 component.
     *
     * @return the initialized component instance
     */
    public Form getPREG2() {
        if (PREG2 == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            PREG2 = new Form("form", new Item[]{getChoiceGroup1()});//GEN-BEGIN:|27-getter|1|27-postInit
            PREG2.addCommand(getOkCommand2());
            PREG2.setCommandListener(this);//GEN-END:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return PREG2;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of choiceGroup1 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup("Redes que abarcan conexiones locales como una instituci\u00F3n, oficina, casa, ect. ", Choice.EXCLUSIVE);//GEN-BEGIN:|30-getter|1|30-postInit
            choiceGroup1.append("MAN", null);
            choiceGroup1.append("LAN", null);
            choiceGroup1.append("WAN", null);
            choiceGroup1.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return choiceGroup1;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PREG3 ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initialized instance of PREG3 component.
     *
     * @return the initialized component instance
     */
    public Form getPREG3() {
        if (PREG3 == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            PREG3 = new Form("form", new Item[]{getChoiceGroup2()});//GEN-BEGIN:|36-getter|1|36-postInit
            PREG3.addCommand(getOkCommand3());
            PREG3.setCommandListener(this);//GEN-END:|36-getter|1|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|2|
        return PREG3;
    }
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup2 ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initialized instance of choiceGroup2 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup2() {
        if (choiceGroup2 == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            choiceGroup2 = new ChoiceGroup("Seleccione la opci\u00F3n que corresponde a un medio de transmisi\u00F3n no guiado:", Choice.POPUP);//GEN-BEGIN:|40-getter|1|40-postInit
            choiceGroup2.append("PAR TRENZADO", null);
            choiceGroup2.append("ANTENAS", null);
            choiceGroup2.append("FIBRA OPTICA", null);
            choiceGroup2.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|40-getter|1|40-postInit
            // write post-init user code here
        }//GEN-BEGIN:|40-getter|2|
        return choiceGroup2;
    }
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PREG4 ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initialized instance of PREG4 component.
     *
     * @return the initialized component instance
     */
    public Form getPREG4() {
        if (PREG4 == null) {//GEN-END:|45-getter|0|45-preInit
            // write pre-init user code here
            PREG4 = new Form("form", new Item[]{getTextField()});//GEN-BEGIN:|45-getter|1|45-postInit
            PREG4.addCommand(getOkCommand4());
            PREG4.setCommandListener(this);//GEN-END:|45-getter|1|45-postInit
            // write post-init user code here
        }//GEN-BEGIN:|45-getter|2|
        return PREG4;
    }
//</editor-fold>//GEN-END:|45-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            textField = new TextField("Escriba la clase a la que pertenece la siguiente direcci\u00F3n 192.168.1.12", "", 32, TextField.ANY);//GEN-LINE:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|50-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PREG5 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of PREG5 component.
     *
     * @return the initialized component instance
     */
    public Form getPREG5() {
        if (PREG5 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            PREG5 = new Form("form", new Item[]{getChoiceGroup3()});//GEN-BEGIN:|51-getter|1|51-postInit
            PREG5.addCommand(getOkCommand5());
            PREG5.setCommandListener(this);//GEN-END:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return PREG5;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup3 ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initialized instance of choiceGroup3 component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup3() {
        if (choiceGroup3 == null) {//GEN-END:|55-getter|0|55-preInit
            // write pre-init user code here
            choiceGroup3 = new ChoiceGroup("\u00BFCual es el c\u00F3digo de colores utilizado en  un cable de red?", Choice.EXCLUSIVE);//GEN-BEGIN:|55-getter|1|55-postInit
            choiceGroup3.append("B/N, A, B/C, N, B/A, V, B/V, C ", null);
            choiceGroup3.append("C, B/C, V, A, B/V, B/N, N, B/A", null);
            choiceGroup3.append("B/N, N, B/V, A, B/A, V, B/C, C\n", null);
            choiceGroup3.setSelectedFlags(new boolean[]{false, false, false});//GEN-END:|55-getter|1|55-postInit
            // write post-init user code here
        }//GEN-BEGIN:|55-getter|2|
        return choiceGroup3;
    }
//</editor-fold>//GEN-END:|55-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: alert ">//GEN-BEGIN:|59-getter|0|59-preInit
    /**
     * Returns an initialized instance of alert component.
     *
     * @return the initialized component instance
     */
    public Alert getAlert() {
        if (alert == null) {//GEN-END:|59-getter|0|59-preInit
            // write pre-init user code here
            alert = new Alert("RESULTADO");//GEN-BEGIN:|59-getter|1|59-postInit
            alert.setTimeout(Alert.FOREVER);//GEN-END:|59-getter|1|59-postInit
            // write post-init user code here
        }//GEN-BEGIN:|59-getter|2|
        return alert;
    }
//</editor-fold>//GEN-END:|59-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: FIN ">//GEN-BEGIN:|61-getter|0|61-preInit
    /**
     * Returns an initialized instance of FIN component.
     *
     * @return the initialized component instance
     */
    public Form getFIN() {
        if (FIN == null) {//GEN-END:|61-getter|0|61-preInit
            // write pre-init user code here
            FIN = new Form("form", new Item[]{getStringItem1()});//GEN-BEGIN:|61-getter|1|61-postInit
            FIN.addCommand(getOkCommand6());
            FIN.setCommandListener(this);//GEN-END:|61-getter|1|61-postInit
            // write post-init user code here
        }//GEN-BEGIN:|61-getter|2|
        return FIN;
    }
//</editor-fold>//GEN-END:|61-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|15-getter|0|15-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|15-getter|0|15-preInit
            // write pre-init user code here
            okCommand = new Command("INICIAR", Command.OK, 0);//GEN-LINE:|15-getter|1|15-postInit
            // write post-init user code here
        }//GEN-BEGIN:|15-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|15-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|21-getter|0|21-preInit
            // write pre-init user code here
            okCommand1 = new Command("NEXT", Command.OK, 0);//GEN-LINE:|21-getter|1|21-postInit
            // write post-init user code here
        }//GEN-BEGIN:|21-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            okCommand2 = new Command("NEXT", Command.OK, 0);//GEN-LINE:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|28-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initialized instance of okCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            okCommand3 = new Command("NEXT", Command.OK, 0);//GEN-LINE:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return okCommand3;
    }
//</editor-fold>//GEN-END:|37-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initialized instance of okCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {//GEN-END:|46-getter|0|46-preInit
            // write pre-init user code here
            okCommand4 = new Command("NEXT", Command.OK, 0);//GEN-LINE:|46-getter|1|46-postInit
            // write post-init user code here
        }//GEN-BEGIN:|46-getter|2|
        return okCommand4;
    }
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand5 ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initialized instance of okCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand5() {
        if (okCommand5 == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            okCommand5 = new Command("CALIFICAR", Command.OK, 0);//GEN-LINE:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return okCommand5;
    }
//</editor-fold>//GEN-END:|52-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand6 ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initialized instance of okCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand6() {
        if (okCommand6 == null) {//GEN-END:|62-getter|0|62-preInit
            // write pre-init user code here
            okCommand6 = new Command("Ok", Command.OK, 0);//GEN-LINE:|62-getter|1|62-postInit
            // write post-init user code here
        }//GEN-BEGIN:|62-getter|2|
        return okCommand6;
    }
//</editor-fold>//GEN-END:|62-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initialized instance of stringItem1 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            stringItem1 = new StringItem("EVALUACION HA TERMINADO", "");//GEN-LINE:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return stringItem1;
    }
//</editor-fold>//GEN-END:|65-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
