package gwt.material.design.client;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Test implements EntryPoint {


    public void onModuleLoad() {

        MaterialContainer panel = new MaterialContainer();
        panel.setTitle("TEST-PANEL");
        panel.addStyleName("container");

        MaterialRow row = new MaterialRow();

        final MaterialListBox materialListBox = new MaterialListBox();
        materialListBox.setPlaceholder("Pippos");

        materialListBox.setMultipleSelect(true);
        materialListBox.setEmptyPlaceHolder("Seleziona sto pardi");

        materialListBox.addItem("Z", HasDirection.Direction.DEFAULT, "VALUE Z");
        materialListBox.addItem("A", HasDirection.Direction.DEFAULT, "VALUE A");
        materialListBox.addItem("B", HasDirection.Direction.DEFAULT, "VALUE B");

        materialListBox.addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                GWT.log("BAU " + event.toDebugString());
                GWT.log("BAU 2 " + materialListBox.getItemsSelected());
            }
        });

        //materialListBox.setItemSelected(1, true);
        //materialListBox.setItemSelected(2, true);


        materialListBox.setGrid("s3");

        row.add(materialListBox);
        panel.add(row);
        RootPanel.get().add(panel);
    }

}
