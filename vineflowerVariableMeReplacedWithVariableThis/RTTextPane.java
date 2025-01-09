package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.awt.Graphics;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class RTTextPane extends JTextPane implements DocumentListener {
   public void _Modified(VB.MODTYPE action, DocumentEvent e) {
   }

   public void _Paint(Graphics g) {
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public JTextPane $Parent() {
      JTextPane $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void setDocument(Document refDoc) {
      Throwable Err = null;

      try {
         super.setDocument(refDoc);
         refDoc.removeDocumentListener(this);
         refDoc.addDocumentListener(this);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   @Override
   protected void paintComponent(Graphics g) {
      Throwable Err = null;

      label44:
      try {
         super.paintComponent(g);
      } finally {
         break label44;
      }

      try {
         _Paint(g);
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void insertUpdate(DocumentEvent e) {
      Throwable Err = null;

      try {
         _Modified(VB.MODTYPE.DOC_INSERT, e);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void removeUpdate(DocumentEvent e) {
      Throwable Err = null;

      try {
         _Modified(VB.MODTYPE.DOC_REMOVE, e);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void changedUpdate(DocumentEvent e) {
      Throwable Err = null;

      try {
         _Modified(VB.MODTYPE.DOC_CHANGED, e);
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   public RTTextPane() {
      initVars();
   }

   private void initVars() {
   }
}
