for(Object e : mc.theWorld.loadedEntityList) {
  if (e instanceof EntityPlayer) {
    if(((EntityPlayer) e).getName().equals(args[0])) {
     EntityPlayer p = (EntityPlayer) e;
     String cleanUUID = p.getUniqueID().toString().replaceAll("-", "");
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","-----------------------------");
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","Name: " + p.getName());
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","Invis: " + p.isInvisible());
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","NBTTagCompound: " + p.getNBTTagCompound());
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","UUID: " + p.getUniqueID());
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","UUID (Clean): " + cleanUUID);
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","X: " + p.posX + " Y: " + p.posY + " Z: " + p.posZ);
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","Yaw: " + p.rotationYaw + " Pitch: " + p.rotationPitch);
     Artemis.addCustomChatMessage("[§7Data Grabber§f]","-----------------------------");
    }
  }
}
