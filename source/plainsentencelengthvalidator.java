package cc.redpen.validator.sentence;

/**
 * Validate input sentences contain more characters more than specified.
 */
 final public class PlainSentenceLengthValidator extends Validator {
     /**
      * Default maximum length of sentences.
  */
  public static final int DEFAULT_MAX_LENGTH = 30;
      private int maxLength = DEFAULT_MAX_LENGTH;

      @Override
  public void validate(Sentence sentence) {
       if (sentence.getContent().length() > maxLength) {
           addValidationError(sentence, sentence.getContent().length(), maxLength);
        }
  }

      @Override
      protected void init() throws RedPenException {
            this.maxLength = getConfigAttributeAsInt("max_len", DEFAULT_MAX_LENGTH);
      }
 }

