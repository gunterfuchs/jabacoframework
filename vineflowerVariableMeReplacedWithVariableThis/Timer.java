package vineflowerVariableMeReplacedWithVariableThis;

import VBA.Interaction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class Timer extends TimerTask implements VB.IJabacoClass, ActionListener {
   private javax.swing.Timer MyTimer;
   private long MyFirstInterval;
   private long MyInterval;
   private boolean MyEnabled;
   private boolean MyEnabledState;

   public void _Timer() {
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Throwable Err = null;

      try {
         _Timer();
      } finally {
         return;
      }
   }

   @Override
   public void run() {
      Throwable Err = null;

      try {
         _Timer();
      } finally {
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void Class_Initialize() {
      Throwable Err = null;

      try {
         MyFirstInterval = (long)0;
         MyInterval = (long)0;
         MyEnabled = false;
         MyEnabledState = false;
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float $Interval() {
      float $Interval = 0.0F;
      Throwable Err = null;

      try {
         $Interval = (float)MyInterval;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Interval;
      }

      return $Interval;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Interval(float v) {
      Throwable Err = null;

      try {
         if (v < (float)0) {
            v = (float)0;
         }

         MyInterval = (long)v;
         MyFirstInterval = (long)v;
         InitTimer();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean $Enabled() {
      boolean $Enabled = false;
      Throwable Err = null;

      try {
         $Enabled = MyEnabled;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Enabled;
      }

      return $Enabled;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void $Enabled(boolean v) {
      Throwable Err = null;

      try {
         MyEnabled = v;
         InitTimer();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean booleanValue() {
      boolean booleanValue = false;
      Throwable Err = null;

      try {
         booleanValue = $Enabled();
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return booleanValue;
      }

      return booleanValue;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void InitTimer() {
      Throwable Err = null;

      try {
         if (!MyEnabled) {
            if (MyEnabledState) {
               MyTimer.stop();
            }

            MyEnabledState = false;
         } else {
            if (MyFirstInterval > (long)0) {
               MyTimer.setInitialDelay((int)MyInterval);
               MyTimer.setDelay((int)MyInterval);
            }

            MyTimer.start();
            MyEnabledState = true;
         }
      } catch (Throwable var4) {
         Interaction.MsgBox(var4);
         return;
      }
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public TimerTask $Parent() {
      TimerTask $Parent = null;
      Throwable Err = null;

      try {
         $Parent = this;
      } catch (Throwable var5) {
         Interaction.MsgBox(var5);
         return $Parent;
      }

      return $Parent;
   }

   public Timer() {
      initVars();
      Class_Initialize();
   }

   private void initVars() {
      MyTimer = new javax.swing.Timer(0, this);
      MyFirstInterval = 0L;
      MyInterval = 0L;
      MyEnabled = false;
      MyEnabledState = false;
   }
}
