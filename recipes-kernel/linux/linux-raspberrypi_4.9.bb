FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.9.52"

SRCREV = "19577521f46c188a592f44cb311c0d421b0c9d93"
SRC_URI = "git://github.com/synapticon/linux.git;branch=cm3_64"

require linux-raspberrypi.inc
