package org.moflon.maave.wsconfig;

public class WsInfo
{
   private static final String CURRENT_WS_LOC_KEY = "CurrentWSLoc";
   static String verboseLevelVar = System.getenv().get("MAaVeVerboseLevel");

   public static int getVerboseLevel()
   {
      int verboseLevel = 0;
      if (verboseLevelVar != null)
      {
         try
         {
            verboseLevel = Integer.parseInt(verboseLevelVar);
         } catch (NumberFormatException e)
         {
            verboseLevel = 0;
         }

      }
      return verboseLevel;
   }

   public static String getCurrentWsLoc()
   {
      final String workspaceLocation = System.getenv().get(CURRENT_WS_LOC_KEY);
      if (workspaceLocation == null)
         throw new IllegalStateException(String.format("Expect environment variable '%s' to point to the root of the Eclipse workspace", CURRENT_WS_LOC_KEY));
      return workspaceLocation;
   }
}
