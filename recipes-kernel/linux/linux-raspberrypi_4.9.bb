FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.9.52"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/synapticon/linux.git;branch=hack_cm3_64"

require linux-raspberrypi.inc
