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
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.ui.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Test implements EntryPoint {


    public void onModuleLoad() {

        MaterialContainer panel = new MaterialContainer();
        panel.setTitle("TEST-PANEL");


        final MaterialPager materialPager = new MaterialPager();
        materialPager.setTotal(260);
        materialPager.setGrid("s12");
        materialPager.setEnableIndicator(true);
        materialPager.setIndicatorTemplate("Siamo a pagina {page} di un totale di {total}");

        Scheduler.get().scheduleFixedDelay(new Scheduler.RepeatingCommand() {
            @Override
            public boolean execute() {
                materialPager.setTotal(461);
                return false;
            }
        }, 5000);

        MaterialRow row = new MaterialRow();
        row.add(materialPager);

        panel.add(row);
        RootPanel.get().add(panel);
    }

}
