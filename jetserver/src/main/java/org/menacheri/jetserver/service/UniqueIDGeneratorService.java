package org.menacheri.jetserver.service;

/**
 * This class is used to generate unique id's across the network. For a single
 * VM the default implementation would be and incrementing long counter.
 * 
 * @author Abraham.Menacherry
 * 
 */
public interface UniqueIDGeneratorService 
{
	/**
	 * Returns a unique id across the network, including those generated by
	 * {@link #generateFor(Class)} method. For e.g. if generateFor has already
	 * generated id "1", this method will not return "1" anymore. For a single
	 * JVM server, this method would just send back an Atomically incremented
	 * counter.
	 * 
	 * @return A unique id.
	 */
	public Object generate();
	
	/**
	 * Returns a unique id across the network, including those generated by
	 * {@link #generate()} method. For e.g. if generate has already generated id
	 * "1", this method will not return "1" anymore. For a single JVM server,
	 * this method would just send back an Atomically incremented counter.
	 * 
	 * @param klass
	 *            The class for which this method is being generated. The
	 *            generator implementation can then probably put in a suffix of
	 *            identification for generated id's.
	 * @return A unique id.
	 */
	public Object generateFor(@SuppressWarnings("rawtypes") Class klass);
}