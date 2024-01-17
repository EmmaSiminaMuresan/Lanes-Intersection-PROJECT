import Components.Activation;
import Components.Condition;
import Components.GuardMapping;
import Components.PetriNet;
import Components.PetriNetWindow;
import Components.PetriTransition;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Intersections2 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Lanes Intersection";

        pn.NetworkPort = 1080;

        DataString green = new DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString full = new DataString();
        full.SetName("full");
        full.SetValue("full");
        pn.ConstantPlaceList.add(full);

        // --------------------------------------------------------------------
        // -------------------------------PIN 1--------------------------------
        // --------------------------------------------------------------------


        // --------------------------------------------------------------------
        // -------------------------------BD-UL 21 DECEMBRIE-------------------
        // --------------------------------------------------------------------

        DataTransfer OP1 = new DataTransfer();
        OP1.SetName("OP1");
        OP1.Value = new TransferOperation("localhost", "1081", "in1");
        pn.PlaceList.add(OP1);

        DataCar p1 = new DataCar();
        p1.SetName("P_a1");
        pn.PlaceList.add(p1);

        DataCarQueue p2 = new DataCarQueue();
        p2.Value.Size = 3;
        p2.SetName("P_x1");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("P_TL1");
        pn.PlaceList.add(p3);

        DataCar p4 = new DataCar();
        p4.SetName("P_b1");
        pn.PlaceList.add(p4);

        // -------------------------------------------------------------------------------------
        // --------------------------------PIATA UNIRII-----------------------------------------
        // -------------------------------------------------------------------------------------

        DataTransfer OP2 = new DataTransfer();
        OP2.SetName("OP2");
        OP2.Value = new TransferOperation("localhost", "1081", "in2");
        pn.PlaceList.add(OP2);

        DataCar p5 = new DataCar(); //p5.Printable = false;
        p5.SetName("P_a2");
        pn.PlaceList.add(p5);

        DataCarQueue p6 = new DataCarQueue(); //p6.Printable = false;
        p6.Value.Size = 3;
        p6.SetName("P_x2");
        pn.PlaceList.add(p6);

        DataString p7 = new DataString(); //p7.Printable = false;
        p7.SetName("P_TL2");
        pn.PlaceList.add(p7);

        DataCar p8 = new DataCar(); //p8.Printable = false;
        p8.SetName("P_b2");
        pn.PlaceList.add(p8);

        // ----------------------------------------------------------------------------
        // ----------------------------STR. REGELE FERDINAND---------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p9 = new DataCarQueue();
        p9.Value.Size = 3;
        p9.SetName("P_o1");
        pn.PlaceList.add(p9);

        DataCar p10 = new DataCar();
        p10.SetName("P_o1e");
        pn.PlaceList.add(p10);

        // ----------------------------------------------------------------------------
        // ----------------------------PIATA UNIRII------------------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p11 = new DataCarQueue(); //p19.Printable = false;
        p11.Value.Size = 3;
        p11.SetName("P_o2");
        pn.PlaceList.add(p11);

        // -------------------------------------------------------------------------------------------
        // --------------------------------Intersection PIN 1-----------------------------------------
        // -------------------------------------------------------------------------------------------


        DataCarQueue p13 = new DataCarQueue();
        p13.Value.Size = 3;
        p13.SetName("P_I1");
        pn.PlaceList.add(p13);

        // ----------------------------------------------------------------------------
        // ----------------------------EXIT1 - STR. IOAN RATIU ------------------------
        // ----------------------------------------------------------------------------

        DataCar p14 = new DataCar(); //p22.Printable = false;
        p14.SetName("P1_1");
        pn.PlaceList.add(p14);

        DataCarQueue p15 = new DataCarQueue(); //p21.Printable = false;
        p15.Value.Size = 3;
        p15.SetName("P1_2");
        pn.PlaceList.add(p15);

        DataCar p16 = new DataCar(); //p22.Printable = false;
        p16.SetName("P1_3");
        pn.PlaceList.add(p16);

        DataCarQueue p17 = new DataCarQueue(); //p22.Printable = false;
        p17.SetName("P1_4");
        pn.PlaceList.add(p17);

        // ----------------------------------------------------------------------------
        // ----------------------------EXIT2 – STR. SAMUIL MICU -----------------------
        // ----------------------------------------------------------------------------

        DataCar p18 = new DataCar(); //p22.Printable = false;
        p18.SetName("P2_1");
        pn.PlaceList.add(p18);

        DataCarQueue p19 = new DataCarQueue(); //p21.Printable = false;
        p19.Value.Size = 3;
        p19.SetName("P2_2");
        pn.PlaceList.add(p19);

        DataCar p20 = new DataCar(); //p22.Printable = false;
        p20.SetName("P2_3");
        pn.PlaceList.add(p20);

        // --------------------------------------------------------------------
        // -------------------------------PIN 2--------------------------------
        // --------------------------------------------------------------------


        // --------------------------------------------------------------------
        // -------------------------------STR. MEMORANDUMULUI------------------
        // --------------------------------------------------------------------

        DataTransfer OP3 = new DataTransfer();
        OP3.SetName("OP3");
        OP3.Value = new TransferOperation("localhost", "1082", "in3");
        pn.PlaceList.add(OP3);

        DataCar p21 = new DataCar(); //p22.Printable = false;
        p21.SetName("P_a3");
        pn.PlaceList.add(p21);

        DataCarQueue p22 = new DataCarQueue();
        p22.Value.Size = 3;
        p22.SetName("P_x3");
        pn.PlaceList.add(p22);

        DataString p23 = new DataString();
        p23.SetName("P_TL3");
        pn.PlaceList.add(p23);

        DataCar p24 = new DataCar();
        p24.SetName("P_b3");
        pn.PlaceList.add(p24);

        // -------------------------------------------------------------------------------------
        // --------------------------------EMIL ISAC--------------------------------------------
        // -------------------------------------------------------------------------------------

        DataTransfer OP4 = new DataTransfer();
        OP4.SetName("OP4");
        OP4.Value = new TransferOperation("localhost", "1082", "in4");
        pn.PlaceList.add(OP4);

        DataCar p25 = new DataCar(); //p5.Printable = false;
        p25.SetName("P_a4");
        pn.PlaceList.add(p25);

        DataCarQueue p26 = new DataCarQueue(); //p6.Printable = false;
        p26.Value.Size = 3;
        p26.SetName("P_x4");
        pn.PlaceList.add(p26);

        DataString p27 = new DataString(); //p7.Printable = false;
        p27.SetName("P_TL4");
        pn.PlaceList.add(p27);

        DataCar p28 = new DataCar(); //p8.Printable = false;
        p28.SetName("P_b4");
        pn.PlaceList.add(p28);

        // ----------------------------------------------------------------------------
        // ----------------------------STR. GHEORGHE SINCAI - EXIT---------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p29 = new DataCarQueue();
        p29.Value.Size = 3;
        p29.SetName("P_o3");
        pn.PlaceList.add(p9);

        DataCar p30 = new DataCar();
        p30.SetName("P_o3e");
        pn.PlaceList.add(p30);

        // ----------------------------------------------------------------------------
        // ----------------------------CALEA MOTILOR - EXIT----------------------------
        // ----------------------------------------------------------------------------

        DataCarQueue p31 = new DataCarQueue(); //p19.Printable = false;
        p31.Value.Size = 3;
        p31.SetName("P_o4");
        pn.PlaceList.add(p31);

        DataCar p32 = new DataCar(); //p20.Printable = false;
        p32.SetName("P_o4e");
        pn.PlaceList.add(p32);

        // -------------------------------------------------------------------------------------------
        // --------------------------------Intersection PIN 2-----------------------------------------
        // -------------------------------------------------------------------------------------------


        DataCarQueue p33 = new DataCarQueue();
        p33.Value.Size = 3;
        p33.SetName("P_I2");
        pn.PlaceList.add(p33);


        // INTERSECTION PIN 1 //

        // T1 ------------------------------------------------
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "T_u1";
        t1.InputPlaceName.add("P_a1");
        t1.InputPlaceName.add("P_x1");

        Condition T1Ct1 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
        Condition T1Ct2 = new Condition(t1, "P_x1", TransitionCondition.CanAddCars);
        T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;
        grdT1.Activations.add(new Activation(t1, "P_a1", TransitionOperation.AddElement, "P_x1"));
        t1.GuardMappingList.add(grdT1);

        Condition T1Ct3 = new Condition(t1, "P_a1", TransitionCondition.NotNull);
        Condition T1Ct4 = new Condition(t1, "P_x1", TransitionCondition.CanNotAddCars);
        T1Ct3.SetNextCondition(LogicConnector.AND, T1Ct4);

        GuardMapping grdT1a = new GuardMapping();
        grdT1a.condition= T1Ct3;
        grdT1a.Activations.add(new Activation(t1, "full", TransitionOperation.SendOverNetwork, "OP1"));
        grdT1a.Activations.add(new Activation(t1, "P_a1", TransitionOperation.Move, "P_a1"));
        t1.GuardMappingList.add(grdT1a);

        t1.Delay = 0;
        pn.Transitions.add(t1);

        // T2 ------------------------------------------------
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "T_e1";
        t2.InputPlaceName.add("P_x1");
        t2.InputPlaceName.add("P_TL1");

        Condition T2Ct1 = new Condition(t2, "P_TL1", TransitionCondition.Equal, "green");
        Condition T2Ct2 = new Condition(t2, "P_x1", TransitionCondition.HaveCar);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;
        grdT2.Activations.add(new Activation(t2, "P_x1", TransitionOperation.PopElementWithoutTarget, "P_b1"));
        grdT2.Activations.add(new Activation(t2, "P_TL1", TransitionOperation.Move, "P_TL1"));

        t2.GuardMappingList.add(grdT2);

//		t2.Delay = 3;
        pn.Transitions.add(t2);

        // T3 ------------------------------------------------
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "T_i1";
        t3.InputPlaceName.add("P_b1");
        t3.InputPlaceName.add("P_I1");

        Condition T3Ct1 = new Condition(t3, "P_b1", TransitionCondition.NotNull);
        Condition T3Ct2 = new Condition(t3, "P_I1", TransitionCondition.CanAddCars);
        T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3Ct1;
        grdT3.Activations.add(new Activation(t3, "P_b1", TransitionOperation.AddElement, "P_I1"));
        t3.GuardMappingList.add(grdT3);

        t3.Delay = 0;
        pn.Transitions.add(t3);

        // PIATA UNIRII - INTRARE
        // T4 ------------------------------------------------
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "T_u2";
        t4.InputPlaceName.add("P_a2");
        t4.InputPlaceName.add("P_x2");

        Condition T4Ct1 = new Condition(t4, "P_a2", TransitionCondition.NotNull);
        Condition T4Ct2 = new Condition(t4, "P_x2", TransitionCondition.CanAddCars);
        T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

        GuardMapping grdT4 = new GuardMapping();
        grdT4.condition = T4Ct1;
        grdT4.Activations.add(new Activation(t4, "P_a2", TransitionOperation.AddElement, "P_x2"));
        t4.GuardMappingList.add(grdT4);

        Condition T4Ct3 = new Condition(t4, "P_a2", TransitionCondition.NotNull);
        Condition T4Ct4 = new Condition(t4, "P_x2", TransitionCondition.CanNotAddCars);
        T4Ct3.SetNextCondition(LogicConnector.AND, T4Ct4);

        GuardMapping grdT4a = new GuardMapping();
        grdT4a.condition= T4Ct3;
        grdT4a.Activations.add(new Activation(t4, "full", TransitionOperation.SendOverNetwork, "OP2"));
        grdT4a.Activations.add(new Activation(t4, "P_a2", TransitionOperation.Move, "P_a2"));
        t4.GuardMappingList.add(grdT4a);

        t4.Delay = 0;
        pn.Transitions.add(t4);

        // T5 ------------------------------------------------
        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "T_e2";
        t5.InputPlaceName.add("P_x2");
        t5.InputPlaceName.add("P_TL2");

        Condition T5Ct1 = new Condition(t5, "P_TL2", TransitionCondition.Equal, "green");
        Condition T5Ct2 = new Condition(t5, "P_x2", TransitionCondition.HaveCar);
        T5Ct1.SetNextCondition(LogicConnector.AND, T5Ct2);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition = T5Ct1;
        grdT5.Activations.add(new Activation(t5, "P_x2", TransitionOperation.PopElementWithoutTarget, "P_b2"));
        grdT5.Activations.add(new Activation(t5, "P_TL2", TransitionOperation.Move, "P_TL2"));
        t5.GuardMappingList.add(grdT5);

        t5.Delay = 0;
        pn.Transitions.add(t5);

        // T6 ------------------------------------------------
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "T_i2";
        t6.InputPlaceName.add("P_b2");
        t6.InputPlaceName.add("P_I1");

        Condition T6Ct1 = new Condition(t6, "P_b2", TransitionCondition.NotNull);
        Condition T6Ct2 = new Condition(t6, "P_I1", TransitionCondition.CanAddCars);
        T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition = T6Ct1;
        grdT6.Activations.add(new Activation(t6, "P_b2", TransitionOperation.AddElement, "P_I1"));
        t6.GuardMappingList.add(grdT6);

        t6.Delay = 0;
        pn.Transitions.add(t6);

        // STR. REGELE FERDINAND - IESIRE
        // T7-----------------------------------------------------------
        PetriTransition t7 = new PetriTransition(pn);
        t7.TransitionName = "T_g1";
        t7.InputPlaceName.add("P_I1");
        t7.InputPlaceName.add("P_o1");

        Condition T7Ct1 = new Condition(t7, "P_I1", TransitionCondition.HaveCarForMe);
        Condition T7Ct2 = new Condition(t7, "P_o1", TransitionCondition.CanAddCars);
        T7Ct1.SetNextCondition(LogicConnector.AND, T7Ct2);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition = T7Ct1;
        grdT7.Activations.add(new Activation(t7, "P_I1", TransitionOperation.PopElementWithTargetToQueue, "P_o1"));
        t7.GuardMappingList.add(grdT7);

        t7.Delay = 0;
        pn.Transitions.add(t7);

        // T8----------------------------------------------------------------
        PetriTransition t8 = new PetriTransition(pn);
        t8.TransitionName = "T_g1e";
        t8.InputPlaceName.add("P_o1");

        Condition T8Ct1 = new Condition(t8, "P_o1", TransitionCondition.HaveCar);

        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition = T8Ct1;
        grdT8.Activations.add(new Activation(t8, "P_o1", TransitionOperation.PopElementWithoutTarget, "P_o1e"));
        t8.GuardMappingList.add(grdT8);

        t8.Delay = 0;
        pn.Transitions.add(t8);

        // PIATA UNIRII - IESIRE
        // T9-----------------------------------------------------------
        PetriTransition t9 = new PetriTransition(pn);
        t9.TransitionName = "T_g2";
        t9.InputPlaceName.add("P_I1");
        t9.InputPlaceName.add("P_o2");

        Condition T9Ct1 = new Condition(t9, "P_I1", TransitionCondition.HaveCarForMe);
        Condition T9Ct2 = new Condition(t9, "P_o2", TransitionCondition.CanAddCars);
        T9Ct1.SetNextCondition(LogicConnector.AND, T9Ct2);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition = T9Ct1;
        grdT9.Activations.add(new Activation(t9, "P_I1", TransitionOperation.PopElementWithTargetToQueue, "P_o2"));
        t9.GuardMappingList.add(grdT9);

        t9.Delay = 0;
        pn.Transitions.add(t9);

        // T10----------------------------------------------------------------
        /*PetriTransition t10 = new PetriTransition(pn);
        t10.TransitionName = "T_g2e";
        t10.InputPlaceName.add("P_o2");

        Condition T10Ct1 = new Condition(t10, "P_o2", TransitionCondition.HaveCar);

        GuardMapping grdT10 = new GuardMapping();
        grdT10.condition = T10Ct1;
        grdT10.Activations.add(new Activation(t10, "P_o2", TransitionOperation.PopElementWithoutTarget, "P_o2e"));
        t10.GuardMappingList.add(grdT10);

        t10.Delay = 0;
        pn.Transitions.add(t10);*/


        // STR. MEMORANDUMULUI //

        // EXIT 1 STR. IOAN RATIU //
        // T11 ------------------------------------------------
        PetriTransition t11 = new PetriTransition(pn);
        t11.TransitionName = "T1_1";
        t11.InputPlaceName.add("P_o2");

        Condition T11Ct1 = new Condition(t11, "P_o2", TransitionCondition.HaveCarForMe);

        GuardMapping grdT11 = new GuardMapping();
        grdT11.condition = T11Ct1;
        grdT11.Activations.add(new Activation(t11, "P_o2", TransitionOperation.PopElementWithTarget, "P1_1"));
        t11.GuardMappingList.add(grdT11);

        t11.Delay = 0;
        pn.Transitions.add(t11);


        // T12 ------------------------------------------------
        PetriTransition t12 = new PetriTransition(pn);
        t12.TransitionName = "T1_2";
        t12.InputPlaceName.add("P1_1");

        Condition T12Ct1 = new Condition(t12, "P1_1", TransitionCondition.NotNull);
        Condition T12Ct2 = new Condition(t12, "P1_2", TransitionCondition.CanAddCars);
        T12Ct1.SetNextCondition(LogicConnector.AND, T12Ct2);

        GuardMapping grdT12 = new GuardMapping();
        grdT12.condition = T12Ct1;
        grdT12.Activations.add(new Activation(t12, "P1_1", TransitionOperation.PopElementWithoutTarget, "P1_2"));
        t12.GuardMappingList.add(grdT12);

        t12.Delay = 0;
        pn.Transitions.add(t12);

        // T13----------------------------------------------------------------

        PetriTransition t13 = new PetriTransition(pn);
        t13.TransitionName = "T1_3";
        t13.InputPlaceName.add("P1_2");

        Condition T13Ct1 = new Condition(t13, "P1_2", TransitionCondition.HaveCar);

        GuardMapping grdT13 = new GuardMapping();
        grdT13.condition = T13Ct1;
        grdT13.Activations.add(new Activation(t13, "P1_2", TransitionOperation.PopElementWithoutTarget, "P1_3"));
        t13.GuardMappingList.add(grdT13);

        t13.Delay = 0;
        pn.Transitions.add(t13);

        // T14 ------------------------------------------------
        PetriTransition t14 = new PetriTransition(pn);
        t14.TransitionName = "T1_4";
        t14.InputPlaceName.add("P_o2");

        Condition T14Ct1 = new Condition(t14, "P_o2", TransitionCondition.HaveCarForMe);

        GuardMapping grdT14 = new GuardMapping();
        grdT14.condition = T14Ct1;
        grdT14.Activations.add(new Activation(t14, "P_o2", TransitionOperation.PopElementWithTargetToQueue, "P1_4"));
        t14.GuardMappingList.add(grdT14);

        t14.Delay = 0;
        pn.Transitions.add(t14);


        // EXIT 2 STR. SAMUIL MICU //
        // T15 ------------------------------------------------
        PetriTransition t15 = new PetriTransition(pn);
        t15.TransitionName = "T2_1";
        t15.InputPlaceName.add("P1_4");

        Condition T15Ct1 = new Condition(t15, "P1_4", TransitionCondition.HaveCarForMe);

        GuardMapping grdT15 = new GuardMapping();
        grdT15.condition = T15Ct1;
        grdT15.Activations.add(new Activation(t15, "P1_4", TransitionOperation.PopElementWithTarget, "P2_1"));
        t15.GuardMappingList.add(grdT15);

        t15.Delay = 0;
        pn.Transitions.add(t15);

        // T16 ------------------------------------------------
        PetriTransition t16 = new PetriTransition(pn);
        t16.TransitionName = "T2_2";
        t16.InputPlaceName.add("P2_1");

        Condition T16Ct1 = new Condition(t16, "P2_1", TransitionCondition.NotNull);
        Condition T16Ct2 = new Condition(t16, "P2_2", TransitionCondition.CanAddCars);
        T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);

        GuardMapping grdT16 = new GuardMapping();
        grdT16.condition = T16Ct1;
        grdT16.Activations.add(new Activation(t16, "P2_1", TransitionOperation.PopElementWithoutTarget, "P2_2"));
        t16.GuardMappingList.add(grdT16);

        t16.Delay = 0;
        pn.Transitions.add(t16);

        // T17----------------------------------------------------------------
        PetriTransition t17 = new PetriTransition(pn);
        t17.TransitionName = "T2_3";
        t17.InputPlaceName.add("P2_2");

        Condition T17Ct1 = new Condition(t17, "P2_2", TransitionCondition.HaveCar);

        GuardMapping grdT17 = new GuardMapping();
        grdT17.condition = T17Ct1;
        grdT17.Activations.add(new Activation(t17, "P2_2", TransitionOperation.PopElementWithoutTarget, "P2_3"));
        t17.GuardMappingList.add(grdT17);

        t17.Delay = 0;
        pn.Transitions.add(t17);

        // T18 ------------------------------------------------
        PetriTransition t18 = new PetriTransition(pn);
        t18.TransitionName = "T2_4";
        t18.InputPlaceName.add("P1_4");

        Condition T18Ct1 = new Condition(t18, "P1_4", TransitionCondition.HaveCarForMe);

        GuardMapping grdT18 = new GuardMapping();
        grdT18.condition = T18Ct1;
        grdT18.Activations.add(new Activation(t18, "P1_4", TransitionOperation.PopElementWithTarget, "P_a3"));
        t18.GuardMappingList.add(grdT18);

        t18.Delay = 0;
        pn.Transitions.add(t18);


        // INTERSECTION PIN 2 //

        // STR. MEMORANDUMULUI - INTRARE
        // T19 ------------------------------------------------
        PetriTransition t19 = new PetriTransition(pn);
        t19.TransitionName = "T_u3";
        t19.InputPlaceName.add("P_a3");
        t19.InputPlaceName.add("P_x3");

        Condition T19Ct1 = new Condition(t19, "P_a3", TransitionCondition.NotNull);
        Condition T19Ct2 = new Condition(t19, "P_x3", TransitionCondition.CanAddCars);
        T19Ct1.SetNextCondition(LogicConnector.AND, T19Ct2);

        GuardMapping grdT19 = new GuardMapping();
        grdT19.condition = T19Ct1;
        grdT19.Activations.add(new Activation(t19, "P_a3", TransitionOperation.AddElement, "P_x3"));
        t19.GuardMappingList.add(grdT19);

        Condition T19Ct3 = new Condition(t19, "P_a3", TransitionCondition.NotNull);
        Condition T19Ct4 = new Condition(t19, "P_x3", TransitionCondition.CanNotAddCars);
        T19Ct3.SetNextCondition(LogicConnector.AND, T19Ct4);

        GuardMapping grdT19a = new GuardMapping();
        grdT19a.condition= T19Ct3;
        grdT19a.Activations.add(new Activation(t19, "full", TransitionOperation.SendOverNetwork, "OP3"));
        grdT19a.Activations.add(new Activation(t19, "P_a3", TransitionOperation.Move, "P_a3"));
        t19.GuardMappingList.add(grdT19a);

        t19.Delay = 0;
        pn.Transitions.add(t19);

        // T20 ------------------------------------------------
        PetriTransition t20 = new PetriTransition(pn);
        t20.TransitionName = "T_e3";
        t20.InputPlaceName.add("P_x3");
        t20.InputPlaceName.add("P_TL3");

        Condition T20Ct1 = new Condition(t20, "P_TL3", TransitionCondition.Equal, "green");
        Condition T20Ct2 = new Condition(t20, "P_x3", TransitionCondition.HaveCar);
        T20Ct1.SetNextCondition(LogicConnector.AND, T20Ct2);

        GuardMapping grdT20 = new GuardMapping();
        grdT20.condition = T20Ct1;
        grdT20.Activations.add(new Activation(t20, "P_x3", TransitionOperation.PopElementWithoutTarget, "P_b3"));
        grdT20.Activations.add(new Activation(t20, "P_TL3", TransitionOperation.Move, "P_TL3"));

        t20.GuardMappingList.add(grdT20);

//		t20.Delay = 3;
        pn.Transitions.add(t20);

        // T21 ------------------------------------------------
        PetriTransition t21 = new PetriTransition(pn);
        t21.TransitionName = "T_i3";
        t21.InputPlaceName.add("P_b3");
        t21.InputPlaceName.add("P_I2");

        Condition T21Ct1 = new Condition(t21, "P_b3", TransitionCondition.NotNull);
        Condition T21Ct2 = new Condition(t21, "P_I2", TransitionCondition.CanAddCars);
        T21Ct1.SetNextCondition(LogicConnector.AND, T21Ct2);

        GuardMapping grdT21 = new GuardMapping();
        grdT21.condition = T21Ct1;
        grdT21.Activations.add(new Activation(t21, "P_b3", TransitionOperation.AddElement, "P_I2"));
        t21.GuardMappingList.add(grdT21);

        t21.Delay = 0;
        pn.Transitions.add(t21);

        // STR. EMIL ISAC - INTRARE
        // T22 ------------------------------------------------
        PetriTransition t22 = new PetriTransition(pn);
        t22.TransitionName = "T_u4";
        t22.InputPlaceName.add("P_a4");
        t22.InputPlaceName.add("P_x4");

        Condition T22Ct1 = new Condition(t22, "P_a4", TransitionCondition.NotNull);
        Condition T22Ct2 = new Condition(t22, "P_x4", TransitionCondition.CanAddCars);
        T22Ct1.SetNextCondition(LogicConnector.AND, T22Ct2);

        GuardMapping grdT22 = new GuardMapping();
        grdT22.condition = T22Ct1;
        grdT22.Activations.add(new Activation(t22, "P_a4", TransitionOperation.AddElement, "P_x4"));
        t22.GuardMappingList.add(grdT22);

        Condition T22Ct3 = new Condition(t22, "P_a4", TransitionCondition.NotNull);
        Condition T22Ct4 = new Condition(t22, "P_x4", TransitionCondition.CanNotAddCars);
        T22Ct3.SetNextCondition(LogicConnector.AND, T22Ct4);

        GuardMapping grdT22a = new GuardMapping();
        grdT22a.condition= T22Ct3;
        grdT22a.Activations.add(new Activation(t22, "full", TransitionOperation.SendOverNetwork, "OP4"));
        grdT22a.Activations.add(new Activation(t22, "P_a4", TransitionOperation.Move, "P_a4"));
        t22.GuardMappingList.add(grdT22a);

        t22.Delay = 0;
        pn.Transitions.add(t22);

        // T23 ------------------------------------------------
        PetriTransition t23 = new PetriTransition(pn);
        t23.TransitionName = "T_e4";
        t23.InputPlaceName.add("P_x4");
        t23.InputPlaceName.add("P_TL4");

        Condition T23Ct1 = new Condition(t23, "P_TL4", TransitionCondition.Equal, "green");
        Condition T23Ct2 = new Condition(t23, "P_x4", TransitionCondition.HaveCar);
        T23Ct1.SetNextCondition(LogicConnector.AND, T23Ct2);

        GuardMapping grdT23 = new GuardMapping();
        grdT23.condition = T23Ct1;
        grdT23.Activations.add(new Activation(t23, "P_x4", TransitionOperation.PopElementWithoutTarget, "P_b4"));
        grdT23.Activations.add(new Activation(t23, "P_TL4", TransitionOperation.Move, "P_TL4"));
        t23.GuardMappingList.add(grdT23);

        t23.Delay = 0;
        pn.Transitions.add(t23);

        // T24 ------------------------------------------------
        PetriTransition t24 = new PetriTransition(pn);
        t24.TransitionName = "T_i4";
        t24.InputPlaceName.add("P_b4");
        t24.InputPlaceName.add("P_I2");

        Condition T24Ct1 = new Condition(t24, "P_b4", TransitionCondition.NotNull);
        Condition T24Ct2 = new Condition(t24, "P_I2", TransitionCondition.CanAddCars);
        T24Ct1.SetNextCondition(LogicConnector.AND, T24Ct2);

        GuardMapping grdT24 = new GuardMapping();
        grdT24.condition = T24Ct1;
        grdT24.Activations.add(new Activation(t24, "P_b4", TransitionOperation.AddElement, "P_I2"));
        t24.GuardMappingList.add(grdT24);

        t24.Delay = 0;
        pn.Transitions.add(t24);

        // STR. GHEORGHE SINCAI - EXIT
        // T25-----------------------------------------------------------
        PetriTransition t25 = new PetriTransition(pn);
        t25.TransitionName = "T_g3";
        t25.InputPlaceName.add("P_I2");
        t25.InputPlaceName.add("P_o3");

        Condition T25Ct1 = new Condition(t25, "P_I2", TransitionCondition.HaveCarForMe);
        Condition T25Ct2 = new Condition(t25, "P_o3", TransitionCondition.CanAddCars);
        T25Ct1.SetNextCondition(LogicConnector.AND, T25Ct2);

        GuardMapping grdT25 = new GuardMapping();
        grdT25.condition = T25Ct1;
        grdT25.Activations.add(new Activation(t25, "P_I2", TransitionOperation.PopElementWithTargetToQueue, "P_o3"));
        t25.GuardMappingList.add(grdT25);

        t25.Delay = 0;
        pn.Transitions.add(t25);

        // T26----------------------------------------------------------------
        PetriTransition t26 = new PetriTransition(pn);
        t26.TransitionName = "T_g3e";
        t26.InputPlaceName.add("P_o3");

        Condition T26Ct1 = new Condition(t26, "P_o3", TransitionCondition.HaveCar);

        GuardMapping grdT26 = new GuardMapping();
        grdT26.condition = T26Ct1;
        grdT26.Activations.add(new Activation(t26, "P_o3", TransitionOperation.PopElementWithoutTarget, "P_o3e"));
        t26.GuardMappingList.add(grdT26);

        t26.Delay = 0;
        pn.Transitions.add(t26);

        // CALEA MOTILOR - EXIT
        // T27-----------------------------------------------------------
        PetriTransition t27 = new PetriTransition(pn);
        t27.TransitionName = "T_g4";
        t27.InputPlaceName.add("P_I2");
        t27.InputPlaceName.add("P_o4");

        Condition T27Ct1 = new Condition(t27, "P_I2", TransitionCondition.HaveCarForMe);
        Condition T27Ct2 = new Condition(t27, "P_o4", TransitionCondition.CanAddCars);
        T27Ct1.SetNextCondition(LogicConnector.AND, T27Ct2);

        GuardMapping grdT27 = new GuardMapping();
        grdT27.condition = T27Ct1;
        grdT27.Activations.add(new Activation(t27, "P_I2", TransitionOperation.PopElementWithTargetToQueue, "P_o4"));
        t27.GuardMappingList.add(grdT27);

        t27.Delay = 0;
        pn.Transitions.add(t27);

        // T28----------------------------------------------------------------
        PetriTransition t28 = new PetriTransition(pn);
        t28.TransitionName = "T_g4e";
        t28.InputPlaceName.add("P_o4");

        Condition T28Ct1 = new Condition(t28, "P_o4", TransitionCondition.HaveCar);

        GuardMapping grdT28 = new GuardMapping();
        grdT28.condition = T28Ct1;
        grdT28.Activations.add(new Activation(t28, "P_o4", TransitionOperation.PopElementWithoutTarget, "P_o4e"));
        t28.GuardMappingList.add(grdT28);

        t28.Delay = 0;
        pn.Transitions.add(t28);


        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Lanes Intersection started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }

}