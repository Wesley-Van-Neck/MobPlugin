package com.pikycz.mobplugin.entities.monster.walking;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.item.ItemSwordIron;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.network.protocol.MobEquipmentPacket;

import com.pikycz.mobplugin.entities.monster.WalkingMonster;

/**
 * @author PikyCZ
 */
public class WitherSkeleton extends WalkingMonster {

    public static final int NETWORK_ID = 48;

    @Override
    public int getNetworkId() {
        return NETWORK_ID;
    }

    public WitherSkeleton(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }
    
    @Override
    public String getName() {
        return "WitherSkeleton";
    }

    @Override
    protected void initEntity() {
        super.initEntity();
    }

    @Override
    public float getWidth() {
        return 0.65f;
    }

    @Override
    public float getHeight() {
        return 1.8f;
    }

    @Override
    public void attackEntity(Entity player) {
        //todo
    }

    @Override
    public void spawnTo(Player player) {
        super.spawnTo(player);

        MobEquipmentPacket pk = new MobEquipmentPacket();
        pk.eid = this.getId();
        pk.item = new ItemSwordIron();
        pk.slot = 10;
        pk.selectedSlot = 10;
        player.dataPacket(pk);
    }

    @Override
    public int getKillExperience() {
        return 0;
    }
}
