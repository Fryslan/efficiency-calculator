package org.fryslan.ec.hiscore;

import org.fryslan.ec.Core;

/**
 * Created by Piet Jetse Heeringa on 29-2-2016.
 */
public enum Hiscore {

    OVERALL(0, "Overall", null),
    ATTACK(1, "Attack", "skill_icon_attack.gif"),
    DEFENCE(2, "Defence", "skill_icon_defence.gif"),
    STRENGTH(3, "Strength", "skill_icon_strength.gif"),
    HITPOINTS(4, "Hitpoints", "skill_icon_hitpoints.gif"),
    RANGED(5, "Ranged", "skill_icon_ranged.gif"),
    PRAYER(6, "Prayer", "skill_icon_prayer.gif"),
    MAGIC(7, "Magic", "skill_icon_magic.gif"),
    COOKING(8, "Cooking", "skill_icon_cooking.gif"),
    WOODCUTTING(9, "Woodcutting", "skill_icon_woodcutting.gif"),
    FLETCHING(10, "Fletching", "skill_icon_fletching.gif"),
    FISHING(11, "Fishing", "skill_icon_fishing.gif"),
    FIREMAKING(12, "Firemaking", "skill_icon_firemaking.gif"),
    CRAFTING(13, "Crafting", "skill_icon_crafting.gif"),
    SMITHING(14, "Smithing", "skill_icon_smithing.gif"),
    MINING(15, "Mining", "skill_icon_mining.gif"),
    HERBLORE(16, "Herblore", "skill_icon_herblore.gif"),
    AGILITY(17, "Agility", "skill_icon_agility.gif"),
    THIEVING(18, "Thieving", "skill_icon_thieving.gif"),
    SLAYER(19, "Slayer", "skill_icon_slayer.gif"),
    FARMING(20, "Farming", "skill_icon_farming.gif"),
    RUNECRAFTING(21, "Runecrafting", "skill_icon_runecraft.gif"),
    HUNTER(22, "Hunter", "skill_icon_hunter.gif"),
    CONSTRUCTION(23, "Construction", "skill_icon_construction.gif");

    private int id;
    private String name;
    private String icon;
    private final String ICON_LOCATION = Core.class.getResource("\\resources\\hiscore\\").getPath();
    public static String hiscoreData;

    Hiscore(int id, String name, String icon) {
        this.id = id;
        this.name = name;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        String data = hiscoreData.split(" ")[id];
        return Integer.parseInt(data.split(",")[0]);
    }

    public int getLevel() {
        String data = hiscoreData.split(" ")[id];
        return Integer.parseInt(data.split(",")[1]);
    }

    public int getExperience() {
        String data = hiscoreData.split(" ")[id];
        return Integer.parseInt(data.split(",")[2]);
    }

    public String getIcon() {
        return ICON_LOCATION + icon;
    }
}
