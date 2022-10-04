/*
    Copyright (C) 2022  Val_Mobile

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package me.val_mobile.data;

import me.val_mobile.realisticsurvival.RealisticSurvivalPlugin;
import me.val_mobile.utils.RSVItem;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashMap;
import java.util.Set;

public class MiscItems {

    private final HashMap<String, RSVItem> items = new HashMap<>();

    public MiscItems() {}

    public void initialize() {
        FileConfiguration itemConfig = RealisticSurvivalPlugin.getMiscItemsConfig();
        Set<String> keys = itemConfig.getKeys(false);
        for (String key : keys) {
            if (!key.equals("ConfigId")) {
                RSVItem item = new RSVItem(key);
                items.putIfAbsent(key, item);
            }
        }
    }

    public HashMap<String, RSVItem> getItems() {
        return items;
    }

    public RSVItem getItem(String name) {
        return items.get(name);
    }
}