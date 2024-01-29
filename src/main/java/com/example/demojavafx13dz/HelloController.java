package com.example.demojavafx13dz;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;




    public class HelloController {


            @FXML
            private ResourceBundle resources;

            @FXML
            private URL location;

            @FXML
            private Button ButtonAdd;

            @FXML
            private Button ButtonRemove;
        @FXML
          private Button ButtonRefactor;


        @FXML
            private ListView<String> listOfTasks;
        private ObservableList<String> items ;

            @FXML
            private TextField taskField;
            public HelloController() {

            }

        public ListView<String> getListOfTasks() {
            return listOfTasks;
        }

        @FXML
            void addTask(MouseEvent event) {
             //   items.add(String.valueOf(listOfTasks.getItems().add(taskField.getText())));
            listOfTasks.getItems().add(taskField.getText());
            }
        @FXML
        void refactorTask(MouseEvent event) {     //выбрать то что форматировать
            String selectedValue =listOfTasks.getSelectionModel().getSelectedItem();
            String newValue = taskField.getText();

            if (selectedValue != null && newValue != null) {
                int selectedIndex = listOfTasks.getSelectionModel().getSelectedIndex();
               items.set(selectedIndex, newValue);
            }
        };


            @FXML
            void removeTask(MouseEvent event) {
                int selectedIndex = listOfTasks.getSelectionModel().getSelectedIndex();
                listOfTasks.getItems().remove(selectedIndex);

            }

            @FXML
            void initialize() {
                assert ButtonAdd != null : "fx:id=\"ButtonAdd\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert ButtonRemove != null : "fx:id=\"ButtonRemove\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert ButtonRefactor != null : "fx:id=\"ButtonRefactor\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert listOfTasks != null : "fx:id=\"listOfTasks\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert taskField != null : "fx:id=\"taskField\" was not injected: check your FXML file 'hello-view.fxml'.";
                items = FXCollections.observableArrayList();
                listOfTasks.setItems(items);
            }

        }
