SUMMARY = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
    file://src/hello.c \
    file://0001-Update.patch \
"

S = "${WORKDIR}"

do_compile() {
	${CC} src/hello.c -o helloworld
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 helloworld ${D}${bindir}
}

