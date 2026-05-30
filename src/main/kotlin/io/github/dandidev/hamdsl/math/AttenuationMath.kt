package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.log.Dbm

/**
 * Adds two logarithmic attenuation or gain values.
 *
 * Mathematical background:
 *
 *     L_total[dB] = L_1[dB] + L_2[dB]
 *
 * Cascaded RF attenuations are added directly in dB because dB is logarithmic.
 *
 * Parameters:
 * - this.value: first attenuation or gain value [dB]
 * - other.value: second attenuation or gain value [dB]
 *
 * Result:
 * - total attenuation or gain [dB]
 *
 * Example:
 *
 *     30 dB + 20 dB = 50 dB
 */
operator fun Db.plus(other: Db): Db = Db(value + other.value)

/**
 * Applies attenuation to an absolute RF power level.
 *
 * Mathematical background:
 *
 *     P_out[dBm] = P_in[dBm] - L[dB]
 *
 * where:
 * - P_in is the input RF power level
 * - L is the attenuation
 * - P_out is the resulting RF power level after attenuation
 *
 * Parameters:
 * - this.value: input RF power level \[dBm]
 * - loss.value: attenuation \[dB]
 *
 * Result:
 * - output RF power level \[dBm]
 *
 * Example:
 *
 *     37 dBm - 140 dB = -103 dBm
 */
operator fun Dbm.minus(loss: Db): Dbm = Dbm(value - loss.value)
