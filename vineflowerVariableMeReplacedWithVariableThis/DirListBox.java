package vineflowerVariableMeReplacedWithVariableThis;

import VBA.IResource;
import VBA.Interaction;
import VBA.Strings;
import VBA.VBArray;
import VBA.VBArrayObject;
import VBA.VBArrayString;
import VBA.VBVariant;
import java.io.File;
import java.util.Iterator;

public class DirListBox extends VB.Usercontrol {
   private String myPath;
   private String fileSeparator;
   private VB.DirListBox$TreeView myTree;

   public void _Change() {
   }

   @Override
   public void Usercontrol_Initialize() {
      Throwable Err = null;

      label60: {
         try {
            myTree.$Top((float)0);
            myTree.$Left((float)0);
            Usercontrol_Resize();
            fileSeparator = System.getProperties().getProperty("file.separator");
         } finally {
            break label60;
         }

         new VBArray();

         label51:
         try {
            VBArrayObject roots = VBArray.createVBArray(File.listRoots());
            myTree.$Nodes().Add(null, VB.TreeRelationshipConstants.tvwFirst, "ROOT", ((File)roots.valueOfObj(0)).getPath());
            return;
         } finally {
            break label51;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void Usercontrol_Resize() {
      Throwable Err = null;

      try {
         myTree.$Width($Width());
         myTree.$Height($Height());
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Path(String newPath) {
      Throwable Err = null;
      new VBArray();
      int i = 0;
      VB.Node rootNode = null;
      int h9 = 0;
      int h10 = false;
      File tmp = new File(newPath);

      label186: {
         Throwable var10000;
         label185: {
            label195: {
               VBArrayString splittedPath;
               try {
                  if (!(tmp.exists() & tmp.isDirectory())) {
                     break label195;
                  }

                  myTree.$Nodes().Remove("ROOT");
                  myTree.$Nodes().Clear();
                  splittedPath = SplitPath(newPath);
                  rootNode = myTree
                     .$Nodes()
                     .Add(null, VB.TreeRelationshipConstants.tvwFirst, "ROOT", Strings.StrCat(splittedPath.valueOfStr(0), fileSeparator));
               } finally {
                  break label186;
               }

               i = 1;
               h9 = splittedPath.getUBound(1);

               for (int var33 = 1; i <= h9; i += var33) {
                  try {
                     rootNode = myTree.$Nodes().Add((VB.Node)rootNode, VB.TreeRelationshipConstants.tvwChild, null, splittedPath.valueOfStr(i));
                  } finally {
                     break label186;
                  }
               }

               try {
                  myTree.makeVisible((VB.Node)rootNode);
               } catch (Throwable var28) {
                  var10000 = var28;
                  boolean var10001 = false;
                  break label185;
               }
            }

            label167:
            try {
               return;
            } catch (Throwable var26) {
               var10000 = var26;
               boolean var34 = false;
               break label167;
            }
         }

         Err = var10000;
      }

      Interaction.MsgBox(Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public String $Path() {
      String $Path = "";
      Throwable Err = null;

      try {
         if (myTree.$SelectedItem() != null) {
            $Path = getPath(myTree.$SelectedItem());
         }
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Path;
      }

      return $Path;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private String getPath(VB.Node Node) {
      String getPath = "";
      Throwable Err = null;
      String sPath = "";
      VB.Node oParentNode = null;

      label236: {
         Throwable var41;
         label235: {
            label234: {
               label233: {
                  try {
                     sPath = Node.$Text();
                     oParentNode = Node.$ParentNode();
                  } catch (Throwable var36) {
                     var41 = var36;
                     boolean var10001 = false;
                     break label233;
                  }

                  while (true) {
                     try {
                        ;
                     } catch (Throwable var35) {
                        var41 = var35;
                        boolean var42 = false;
                        break;
                     }

                     boolean var40 = oParentNode != null;

                     try {
                        if (!var40) {
                           break label234;
                        }
                     } catch (Throwable var33) {
                        var41 = var33;
                        boolean var43 = false;
                        break label235;
                     }

                     try {
                        if (Strings.StrComp(oParentNode.$Text(), "ROOT") == 0) {
                           break label234;
                        }

                        sPath = Strings.StrCat(Strings.StrCat(oParentNode.$Text(), fileSeparator), sPath);
                        oParentNode = oParentNode.$ParentNode();
                     } catch (Throwable var34) {
                        var41 = var34;
                        boolean var44 = false;
                        break;
                     }
                  }
               }

               Err = var41;
               break label236;
            }

            label215:
            try {
               getPath = Strings.Replace(sPath, Strings.StrCat(fileSeparator, fileSeparator), fileSeparator);
               return getPath;
            } catch (Throwable var32) {
               var41 = var32;
               boolean var45 = false;
               break label215;
            }
         }

         Err = var41;
      }

      Interaction.MsgBox((Throwable)Err);
      return getPath;
   }

   private void buildFolderTree(VB.Node Node) {
      Throwable Err = null;
      Iterator h7 = null;
      VB.Node tmpNode = null;

      label186: {
         try {
            if (Node == null | Node.$ChildCount() > 0) {
               return;
            }
         } finally {
            break label186;
         }

         new VBArray();

         VBArray childFolders;
         try {
            childFolders = VBArray.createVBArray(new File(getPath(Node)).listFiles());
         } finally {
            break label186;
         }

         File item = null;

         label168:
         try {
            h7 = childFolders.iterator();

            while (h7.hasNext()) {
               item = (File)VBVariant.valueOf(h7.next()).toObject();
               if (item.isDirectory()) {
                  tmpNode = myTree.$Nodes().Add(Node, VB.TreeRelationshipConstants.tvwChild, null, item.getName());
                  myTree.expandNode((VB.Node)tmpNode);
               }
            }

            return;
         } finally {
            break label168;
         }
      }

      Interaction.MsgBox((Throwable)Err);
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private VBArrayString SplitPath(String FullDirPath) {
      VBArrayString SplitPath = null;
      Throwable Err = null;

      try {
         if (Strings.StrComp(Strings.Right(FullDirPath, 1), fileSeparator) == 0) {
            FullDirPath = Strings.Left(FullDirPath, Strings.Len(FullDirPath) - 1);
         }

         SplitPath = Strings.Split(FullDirPath, fileSeparator);
      } catch (Throwable var6) {
         Interaction.MsgBox(var6);
         return SplitPath;
      }

      return SplitPath;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myTree_NodeClick(VB.Node Node) {
      Throwable Err = null;

      try {
         buildFolderTree(Node);
         _Change();
      } catch (Throwable var9) {
         boolean var10001 = false;

         while (true) {
            try {
               break;
            } catch (Throwable var8) {
               var10001 = false;
               continue;
            }
         }
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void myTree_Click() {
      Throwable Err = null;

      try {
         _Click();
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   public DirListBox() {
      initVarsII();
   }

   private void initVarsII() {
      myPath = "";
      fileSeparator = "";
      $Opaque((boolean)-1);
      $AutoRedraw(false);
      $AntiAliasing(false);
      $Transparency(0);
      $DrawWidth(1);
      $BorderColor((long)0);
      $Picture((IResource)null);
      $BorderStyle(VB.fmBorderStyle.fmBorderStyleNone);
      $SpecialEffect(VB.fmSpecialEffect.fmSpecialEffectFlat);
      $FontName("Arial");
      $FontBold(false);
      $FontItalic(false);
      $FontSize(9);
      $BackColor((long)-2147483633);
      $ForeColor((long)0);
      $Width((float)400);
      $Height((float)300);
      $ToolTip("");
      $Enabled((boolean)-1);
      $Tag("");
      $MousePointer(VB.MousePointerConstants.vbDefault);
      $MouseIcon((IResource)null);
      $CanGetFocus((boolean)-1);
      $Anchor(VB.AnchorStyles.vbTopLeft);
      $Left((float)0);
      $Top((float)0);
      $Visible((boolean)-1);
      myTree = new VB.DirListBox$TreeView();
      myTree.setOwner(this, 1);
      VB.DirListBox$TreeView var10000 = myTree;
      myTree.$BorderStyle(VB.fmBorderStyle.fmBorderStyleSingle);
      var10000.$Margin((long)1);
      var10000.$BackColorSel((long)-2147483635);
      var10000.$ForeColorSel((long)-2147483634);
      var10000.$LabelEdit(VB.LabelEditConstants.lvwAutomatic);
      var10000.$LineStyle(VB.TreeLineStyleConstants.tvwTreeLines);
      var10000.$Style(VB.TreeStyleConstants.tvwPictureText);
      var10000.$FontName("Arial");
      var10000.$FontBold(false);
      var10000.$FontItalic(false);
      var10000.$FontSize(9);
      var10000.$BackColor((long)-2147483643);
      var10000.$ForeColor((long)-2147483640);
      var10000.$Width((float)337);
      var10000.$Height((float)233);
      var10000.$ToolTip("");
      var10000.$Enabled((boolean)-1);
      var10000.$Tag("");
      var10000.$MousePointer(VB.MousePointerConstants.vbDefault);
      var10000.$MouseIcon((IResource)null);
      var10000.$CanGetFocus((boolean)-1);
      var10000.$Anchor(VB.AnchorStyles.vbTopLeft);
      add(myTree);
      var10000 = myTree;
      myTree.$Left((float)8);
      var10000.$Top((float)8);
      var10000.$Visible((boolean)-1);
      fireLoaded();
   }
}
