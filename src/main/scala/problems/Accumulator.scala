// See LICENSE.txt for license details.
package problems

import chisel3._

// Problem:
//
// Count incoming trues
// (increase counter every clock if 'in' is asserted)
//
class Accumulator extends Module {
  val io = IO(new Bundle {
    val in  = Input(UInt(1.W))
    val out = Output(UInt(8.W))
  })

  // Implement below ----------
   
  val accum = RegInit(0.U(8.W))
  accum := accum + io.in
  io.out := accum
  // Implement above ----------
}
