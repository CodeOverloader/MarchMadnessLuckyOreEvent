package dev.codeoverload.marchmadnessevents;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.Random;

public class MarchMadnessLuckyOreEvent extends JavaPlugin implements Listener {

    private static final double DROP_CHANCE = 0.01; // 5% chance
    private ItemStack customItem;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        createCustomItem();
    }

    private void createCustomItem() {
        customItem = new ItemStack(Material.GOLDEN_PICKAXE);
        ItemMeta meta = customItem.getItemMeta();
        meta.setDisplayName(ChatColor.YELLOW + "Ore Rush Pick'");
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.DIG_SPEED, 3, true);

        customItem.setItemMeta(meta);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getBlock().getType() == Material.DIAMOND_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.REDSTONE_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.EMERALD_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.LAPIS_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.COAL_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.IRON_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.COPPER_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.GOLD_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_REDSTONE_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_EMERALD_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_LAPIS_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_COAL_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_IRON_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_COPPER_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
        if (event.getBlock().getType() == Material.DEEPSLATE_GOLD_ORE) {
            Random random = new Random();
            if (random.nextDouble() <= DROP_CHANCE) {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), customItem);
            }
        }
    }

}