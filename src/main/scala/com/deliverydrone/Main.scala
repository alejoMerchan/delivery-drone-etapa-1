package com.deliverydrone


import java.io.File

import com.deliverydrone.delivery.Delivery


/**
 * Objeto Main que ejecuta los domiicios.
 *
  * Created by ALEJANDRO on 26/11/2016.
  */
object Main extends App{

  val delivery = new Delivery
  delivery.executeDelivery()


}
