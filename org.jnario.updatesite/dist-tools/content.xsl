<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="xml" indent="yes" />

	<xsl:variable name="repositories"
		select="document('externalRepositories.xml')/external-repositories" />

	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>

	<xsl:template match="repository">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
			<references>
				<xsl:attribute name="size">
					<xsl:value-of select="$repositories/@size * 2" />
				</xsl:attribute>

				<xsl:call-template name="addRepositories" />
			</references>
		</xsl:copy>
	</xsl:template>

	<xsl:template name="addRepositories">
		<xsl:for-each select="$repositories/url">
			<xsl:call-template name="addRepository">
				<xsl:with-param name="repository">
					<xsl:value-of select="." />
				</xsl:with-param>
			</xsl:call-template>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="addRepository">
		<xsl:param name="repository" />

		<repository>
			<xsl:attribute name="uri">
				<xsl:value-of select="$repository" />
			</xsl:attribute>
			<xsl:attribute name="url">
				<xsl:value-of select="$repository" />
			</xsl:attribute>
			<xsl:attribute name="type">0</xsl:attribute>
			<xsl:attribute name="options">1</xsl:attribute>
		</repository>
		<repository>
			<xsl:attribute name="uri">
				<xsl:value-of select="$repository" />
			</xsl:attribute>
			<xsl:attribute name="url">
				<xsl:value-of select="$repository" />
			</xsl:attribute>
			<xsl:attribute name="type">1</xsl:attribute>
			<xsl:attribute name="options">1</xsl:attribute>
		</repository>
	</xsl:template>
</xsl:stylesheet>