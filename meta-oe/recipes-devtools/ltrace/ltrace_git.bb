SUMMARY = "ltrace intercepts and records dynamic library calls"

DESCRIPTION = "ltrace intercepts and records dynamic library calls \
which are called by an executed process and the signals received by that process. \
It can also intercept and print the system calls executed by the program.\
"
HOMEPAGE = "http://ltrace.org/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"

SRCREV = "f44b28421979cec88d6d6a778fc27a8cd514f508"

DEPENDS = "elfutils"
RDEPENDS_${PN} = "elfutils"
SRC_URI = "git://anonscm.debian.org/collab-maint/ltrace.git \
           file://ltrace-0.7.2-unused-typedef.patch \
          "
S = "${WORKDIR}/git"

inherit autotools

do_configure_prepend () {
	( cd ${S}; ./autogen.sh )
}
