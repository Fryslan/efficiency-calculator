package org.fryslan.ec;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.fryslan.ec.hiscore.Hiscore;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Piet Jetse Heeringa on 28-2-2016.
 */
public class Controller implements Initializable {

    @FXML
    public TableView<Hiscore> hiscoreTable;
    @FXML
    public TableColumn<Hiscore, String> iconCol;
    @FXML
    public TableColumn<Hiscore, Number> rankCol;
    @FXML
    public TableColumn<Hiscore, Number> levelCol;
    @FXML
    public TableColumn<Hiscore, Number> experienceCol;

    public void initialize(URL location, ResourceBundle resources) {
        iconCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIcon()));
        rankCol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getRank()));
        levelCol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getLevel()));
        experienceCol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getExperience()));

        iconCol.setCellFactory(col -> new TableCell<Hiscore, String>() {
            private final ImageView imageView = new ImageView();

            @Override
            protected void updateItem(String imageURL, boolean empty) {
                super.updateItem(imageURL, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    Image image = new Image(imageURL, true);
                    imageView.setImage(image);
                    setGraphic(imageView);
                }
            }
        });

        hiscoreTable.getItems().addAll(Hiscore.values());
    }

}
