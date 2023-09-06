<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:param name="title"/>

    <xsl:template match="/">
        <html>
            <head>
                <title><xsl:value-of select="$title"/></title>
                <link rel="stylesheet" href="../css/styles.css" />
            </head>
            <body>
                <header>
                    <h1><xsl:value-of select="$title"/></h1>
                    <nav>
                        <ul>
                            <li><a href="../index.html">Home</a></li>
                            <li><a href="bezeroak-table.html">Bezeroak</a></li>
                            <li><a href="bulegariak-table.html">Bulegariak</a></li>
                        </ul>
                     </nav>
                </header>
                <main>
                    <xsl:apply-templates/>
                </main>
                <footer></footer>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>