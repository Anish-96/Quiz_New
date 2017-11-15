package com.example.anish.quiz_new;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rb, rb2, rb3, rb4;
    private double marks;
    private int number_of_questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = "Note : \n1. Attempt All Questions. \n2. Each Question carries 2 marks. " +
                "\n3.For Wrong Answer, 1 mark would be deducted.. \n4. Once the option is selected, you " +
                "cannot change it. \n5. In case of circular button, only one option is correct. In case of box button," +
                "at most two options can be selected..";
        TextView tv = (TextView) findViewById(R.id.Heading);
        TextView tv1 = (TextView) findViewById(R.id.Heading1);
        TextView tv2 = (TextView) findViewById(R.id.Notice);
        tv.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv1.setPaintFlags(tv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tv2.setText(s);
    }

    public void checkRadio1(View v) {
        Boolean checked = ((RadioButton) v).isChecked();
        rb = (RadioButton) findViewById(R.id.rb_q1_opt1);
        rb2 = (RadioButton) findViewById(R.id.rb_q1_opt2);
        rb3 = (RadioButton) findViewById(R.id.rb_q1_opt3);
        rb4 = (RadioButton) findViewById(R.id.rb_q1_opt4);
        switch (v.getId()) {
            case R.id.rb_q1_opt1:
                if (checked) {
                    marks = marks + 2.0;
                    number_of_questions = number_of_questions + 1;
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q1_opt2:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q1_opt3:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q1_opt4:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                }
                break;
        }
    }

    public void checkRadio2(View v) {
        Boolean checked = ((RadioButton) v).isChecked();
        rb = (RadioButton) findViewById(R.id.rb_q2_opt1);
        rb2 = (RadioButton) findViewById(R.id.rb_q2_opt2);
        rb3 = (RadioButton) findViewById(R.id.rb_q2_opt3);
        rb4 = (RadioButton) findViewById(R.id.rb_q2_opt4);
        switch (v.getId()) {
            case R.id.rb_q2_opt1:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q2_opt2:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q2_opt3:
                if (checked) {
                    marks = marks + 2.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q2_opt4:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                }
                break;
        }
    }

    public void checkRadio3(View v) {
        Boolean checked = ((RadioButton) v).isChecked();
        rb = (RadioButton) findViewById(R.id.rb_q3_opt1);
        rb2 = (RadioButton) findViewById(R.id.rb_q3_opt2);
        rb3 = (RadioButton) findViewById(R.id.rb_q3_opt3);
        rb4 = (RadioButton) findViewById(R.id.rb_q3_opt4);
        switch (v.getId()) {
            case R.id.rb_q3_opt1:
                if (checked) {
                    marks = marks + 2.0;
                    number_of_questions = number_of_questions + 1;
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q3_opt2:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q3_opt3:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q3_opt4:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                }
                break;
        }
    }

    public void checkRadio4(View v) {
        Boolean checked = ((RadioButton) v).isChecked();
        rb = (RadioButton) findViewById(R.id.rb_q4_opt1);
        rb2 = (RadioButton) findViewById(R.id.rb_q4_opt2);
        rb3 = (RadioButton) findViewById(R.id.rb_q4_opt3);
        rb4 = (RadioButton) findViewById(R.id.rb_q4_opt4);
        switch (v.getId()) {
            case R.id.rb_q4_opt1:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q4_opt2:
                if (checked) {
                    marks = marks + 2.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q4_opt3:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q4_opt4:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                }
                break;
        }
    }

    public void checkRadio5(View v) {
        Boolean checked = ((RadioButton) v).isChecked();
        rb = (RadioButton) findViewById(R.id.rb_q5_opt1);
        rb2 = (RadioButton) findViewById(R.id.rb_q5_opt2);
        rb3 = (RadioButton) findViewById(R.id.rb_q5_opt3);
        rb4 = (RadioButton) findViewById(R.id.rb_q5_opt4);
        switch (v.getId()) {
            case R.id.rb_q5_opt1:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q5_opt2:
                if (checked) {
                    marks = marks + 2.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb3.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q5_opt3:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb4.setEnabled(false);
                }
                break;
            case R.id.rb_q5_opt4:
                if (checked) {
                    marks = marks - 1.0;
                    number_of_questions = number_of_questions + 1;
                    rb.setEnabled(false);
                    rb2.setEnabled(false);
                    rb3.setEnabled(false);
                }
                break;
        }
    }

    public void checkRadio6(View v) {
        boolean isChecked = ((CheckBox) findViewById(R.id.cb_q6_opt1)).isChecked();
        boolean isChecked2 = ((CheckBox) findViewById(R.id.cb_q6_opt2)).isChecked();
        boolean isChecked3 = ((CheckBox) findViewById(R.id.cb_q6_opt3)).isChecked();
        boolean isChecked4 = ((CheckBox) findViewById(R.id.cb_q6_opt4)).isChecked();
        CheckBox cb = (CheckBox) findViewById(R.id.cb_q6_opt1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb_q6_opt2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb_q6_opt3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.cb_q6_opt4);
        if (isChecked) {
            cb.setEnabled(false);
            if (isChecked2) {
                marks = marks + 2.0;
                cb2.setEnabled(false);
                cb3.setEnabled(false);
                cb4.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked3) {
                marks = marks - 1.0;
                cb3.setEnabled(false);
                cb2.setEnabled(false);
                cb4.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked4) {
                marks = marks - 1.0;
                cb4.setEnabled(false);
                cb3.setEnabled(false);
                cb2.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
        }
        if (isChecked2) {
            cb2.setEnabled(false);
            if (isChecked) {
                marks = marks + 2.0;
                cb.setEnabled(false);
                cb3.setEnabled(false);
                cb4.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked3) {
                marks = marks - 1.0;
                cb3.setEnabled(false);
                cb.setEnabled(false);
                cb4.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked4) {
                marks = marks - 1.0;
                cb4.setEnabled(false);
                cb3.setEnabled(false);
                cb.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
        }
        if (isChecked3) {
            cb3.setEnabled(false);
            if (isChecked) {
                marks = marks - 1.0;
                cb.setEnabled(false);
                cb2.setEnabled(false);
                cb4.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked2) {
                marks = marks - 1.0;
                cb2.setEnabled(false);
                cb.setEnabled(false);
                cb4.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked4) {
                marks = marks - 1.0;
                cb2.setEnabled(false);
                cb4.setEnabled(false);
                cb.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
        }
        if (isChecked4) {
            cb4.setEnabled(false);
            if (isChecked) {
                marks = marks - 1.0;
                cb.setEnabled(false);
                cb2.setEnabled(false);
                cb3.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked2) {
                marks = marks - 1.0;
                cb2.setEnabled(false);
                cb.setEnabled(false);
                cb3.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
            if (isChecked3) {
                marks = marks - 1.0;
                cb.setEnabled(false);
                cb2.setEnabled(false);
                cb3.setEnabled(false);
                number_of_questions = number_of_questions + 1;
                return;
            }
        }
    }

    public void submitScore(View v) {
        EditText ed = (EditText) findViewById(R.id.edit);
        String s = ed.getText().toString();
        String s1 = createScoreSummary(s, marks, number_of_questions);
        displayScore(s1);
    }

    public String createScoreSummary(String s, double m, int nofq) {
        int score = (int) m;
        String grad = "";
        if (m >= 10 && m <= 12) {
            grad = "A";
        } else if (m >= 0 && m < 10) {
            grad = "B";
        } else {
            grad = "F";
        }
        return "Name : " + s + "\nNumber of Questions Attempted : " + nofq + "/6\nMarks Scored : " + m + "/12.0" +
                "\nGrade :" + grad + "\nThank You Very Much For Attempting The Quiz.";
    }

    public void displayScore(String s) {
        TextView tv = (TextView) findViewById(R.id.score);
        tv.setText("" + s);
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }
}

